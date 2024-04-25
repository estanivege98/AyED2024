package Ejercicio4;
import java.util.*;
import Cola.Queue;
import Ejercicio1.GeneralTree;
import ejercicio1y2.*;
public class AnalizadorArbol {
    
    public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol){
        //List<AreaEmpresa> lista = new LinkedList<AreaEmpresa>();
        GeneralTree<AreaEmpresa> aux;
        Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
        cola.enqueue(arbol);
        cola.enqueue(null);
        double max = -1;
        double suma = 0;
        int cantNodos = 0;
        while (!cola.isEmpty()){
            aux = cola.dequeue();
            if(aux != null){
                cantNodos++;
                suma += arbol.getData().getTardanza();
                List<GeneralTree<AreaEmpresa>> children = aux.getChildren();
                for (GeneralTree<AreaEmpresa> child : children){
                    cola.enqueue(child);
                }
            }
            else{
                if((suma/cantNodos) > max) max = (suma / cantNodos);
                cantNodos = 0;
                suma = 0;
                if(!cola.isEmpty()){
                    cola.enqueue(null);
                }
            }
        }
        return max;
    }
}
