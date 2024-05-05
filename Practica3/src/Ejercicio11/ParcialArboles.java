/* Se debe hacer un recorrido por niveles. */

package Ejercicio11;
import java.util.*;
import Ejercicio1.GeneralTree;
import Cola.Queue;
public class ParcialArboles {
    
    public static boolean resolver(GeneralTree<Integer> arbol){
        int nivel = 1;
        int cantNodos = 0;
        if(arbol.isEmpty()){
            return false;
        }
        else{
            return (!arbol.isLeaf()) ? resolverHelper(arbol, nivel, cantNodos) : true;
        }
    }
    private static boolean resolverHelper(GeneralTree<Integer> arbol, int nivel, int cantNodos){

        Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
        GeneralTree<Integer> abAux;
        cola.enqueue(arbol);
        cola.enqueue(null);
        while (!cola.isEmpty()){
            abAux = cola.dequeue();
            if(abAux != null){
                cantNodos++;
            
                if(cantNodos > nivel){ //compruebo que la cantidad de nodos sea menor que el nivel, si esto no se cumple no es creciente
                    return false;
                }
                for(GeneralTree<Integer> child: abAux.getChildren()){
                    cola.enqueue(child);
                }
            }
            else if (!cola.isEmpty() || (cantNodos < nivel))   {
                if(cantNodos<nivel){
                    return false;
                }
                
                nivel++;
                cantNodos = 0;
                cola.enqueue(null);
                
            } 
        }
        return true;
    }

}
