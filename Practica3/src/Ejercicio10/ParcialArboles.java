/* Se debe hacer un recorrido en profundidad teniendo en cuenta el nivel.  */

package Ejercicio10;
import java.util.*;
import Ejercicio1.GeneralTree;

public class ParcialArboles {
    public static List<Integer> resolver(GeneralTree<Integer> arbol){
        // Pseudocodigo (muy parecido al 7)
        /* preguntar si el arbol es vacio
         * si no es vacio, entonces creo las listas y variables y llamo al helper
         */
    }
    private static Integer resolverHelper(GeneralTree<Integer> ab, List<Integer> listaAct, List<Integer> listaMax, int nivelAct,
    int sumaAct, int sumaMax){
        // Pseudocodigo (muy parecido al 7)
        /*  Actualizo la lista(ab.GetData), preguntando si el dato en el arbol es 1
            actualizo la sumaAct
            if(ab.isLeaf()){
            if(actual>maximo){
                actualizoNumMax;
                actualizoListaMax;    
            }
            else{
                for (GeneralTree<Integer> child : ab.GetChildren()){
                    sumaMax = resolverHelper(child, listaAct, listaMax, nivel+1(NO nivel++), sumaAct, sumaMax)
                    listaAct.remove(listaAct.size() -1); Elimino el ultimo nodo de la lista
                }
            }   
            return sumaMax
        } */
    } 
}
