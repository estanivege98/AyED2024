/* Se debe usar un recorrido en profundidad, ya que necesitamos obtener un camino como resultado. Este camino se debe guardar en una lista 
 * de enteros. Se necesitan dos listas: una que vamos a ir manejando (actual), y la otra que representara el maximo camino que tenemos 
 * (listaMax). Si el nodo es una hijo, se debe agregar a la lista y luego comparar la longitud con listaMax. Si la lista actual es mas grande
 * que listaMax, se debe actualizar listaMax. 
 * Si un nodo tiene dos hijos hojas, el hijos izquierdo debe eliminarse de la lista actual, y agregar su hijo derecho. 
 * Esto mismo se debe repetir cuando se va llamando a la recursion (subiendo de nivel), la lista actual se esta actualizando permanentemente
 * hasta llegar a las hojas.
 */

package Ejercicio7;
import java.util.*;
import Ejercicio1.GeneralTree;
public class Caminos {

    private GeneralTree<Integer> ab;

    public Caminos(GeneralTree<Integer> arb){
        this.ab = arb;
    }

    public List<Integer> caminoAHojaMasLejana(){
        if(ab.isEmpty()){
            return null;
        }
        List<Integer> listaMax = new LinkedList<Integer>();
        List<Integer> listaAct = new LinkedList<Integer>();
        caminoMasLejano(ab,listaMax, listaAct);
        return listaMax;
    } 
    private void caminoMasLejano(GeneralTree<Integer> ab,List<Integer> listaMax, List<Integer> listaAct){
        listaAct.add(ab.getData());
        if(!ab.isLeaf()){
            for(GeneralTree<Integer> child : ab.getChildren()){
                caminoMasLejano(child, listaMax, listaAct);
                }
            }
            else if(listaAct.size() > listaMax.size()){
                listaMax.removeAll(listaMax);
                listaMax.addAll(listaAct);
            }
            listaAct.remove(listaAct.size()-1);
        
        
    }
}
