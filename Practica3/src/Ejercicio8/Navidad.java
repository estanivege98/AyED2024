/* Este ejercicio retoma el ejercicio del abeto de teoria (teoria de arboles binarios). Recorrido en profundidad (preOrden/inOrden/postOeden).
 * Debo contar las hojas por nodo y sumarlas a una variable por nivel.
 */

package Ejercicio8;

import Ejercicio1.GeneralTree;

public class Navidad {
    private GeneralTree<Integer> ab;

    public Navidad(GeneralTree<Integer> arb){
        this.ab = arb;
    }
    public String esAbetoNavidenio(){
        return (esAbeto(ab) ? "Yes" : "No");
    }
    /**
     * Este método verifica si un árbol es un abeto.
     * Si un nodo no es una hoja y no es un abeto, retorna falso.
     * @param ab El árbol a verificar
     * @return true si es un abeto, false si no lo es
     */
    public boolean esAbeto(GeneralTree<Integer> ab){
        int cantHoja = 0;
        for(GeneralTree<Integer> h : ab.getChildren()){
            if(h.isLeaf()) cantHoja++;
            else if(!esAbeto(h)) return false;
        }
        return cantHoja >= 3;
    }
}
