/* Se debe hacer un recorrido en profundidad teniendo en cuenta el nivel.  */

package Ejercicio10;
import java.util.*;
import Ejercicio1.GeneralTree;

public class ParcialArboles {
    public static Integer resolver(GeneralTree<Integer> arbol){
        // Pseudocodigo (muy parecido al 7)
        /* preguntar si el arbol es vacio
         * si no es vacio, entonces creo las listas y variables y llamo al helper
         */
        if(arbol.isLeaf()){
            return null;
        }
        else{
            List<Integer> listaAct = new LinkedList<Integer>();
            List<Integer> listaMax = new LinkedList<Integer>();
            int nivelAct = 0;
            //int nivelMax = Integer.MIN_VALUE;
            int sumaMax = Integer.MIN_VALUE;
            int sumaAct = 0;
            return resolverHelper(arbol, listaAct, listaMax, nivelAct, sumaAct, sumaMax);
        }
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
        if (ab.getData() == 1){
            listaAct.add(ab.getData()*nivelAct);
            sumaAct += ab.getData()*nivelAct;
        }
        if(ab.isLeaf()){
            if(sumaAct > sumaMax){
                sumaMax = sumaAct;
                sumaAct = 0;
                listaMax.removeAll(listaMax);
                listaMax.addAll(listaAct);
            }
            
        }
        else{
           for (GeneralTree<Integer> child : ab.getChildren()){
            sumaMax = resolverHelper(child, listaAct, listaMax, nivelAct+1, sumaAct, sumaMax);
            if (!listaAct.isEmpty()){
                listaAct.remove(listaAct.size()-1);
            }
            
            }
        }
        return sumaMax;
    } 
}
