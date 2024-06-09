/* Sea un grafo en donde cada nodo tiene un color (blanco o gris). Usted debe devolver el camino que comienza en un origen, llega
* a un destino, y pasa alternadamente por nodos de distinto color (y no puede repetir nodos). Para el siguiente grafo, considerando que el
* origen es A, y el destino es D, el camino a retornar es AGCD.
* Tareas:
* a) Indicar que tipo de recorrido se utilizara y justifique por que el recorrido elegido le ayuda a resolver el problema
* b) Implementar el siguiente metodo: ListaGenerica(List<T>) devolverRecorrido (Grafo(Graph<T>(¿) grafo) */

package TercerParcial18Feb2016Grafo;
import java.util.*;
import Graph.*;

public class Parcial {

    public List<String> devolverRecorrido(Graph<LetraColor> grafo){
        List<String> recorrido = new LinkedList<String>();
        boolean[] visitados = new boolean[grafo.getSize()];
        Vertex<LetraColor> v1 = grafo.getVertex(0);
        devolverRecorridoHelper(recorrido, v1, visitados, grafo);
        return recorrido;
    }

    private boolean devolverRecorridoHelper(List<String> recorrido, Vertex<LetraColor> v1, boolean[] visitados, Graph<LetraColor> grafo){
        recorrido.add(v1.getData().getLetra());
        visitados[v1.getPosition()] = true;

        if (v1.getData().getLetra().equals("D")) { // asumiendo que "D" es el destino
            return true;
        }

        List<Edge<LetraColor>> adyacentes = grafo.getEdges(v1);
        for (Edge<LetraColor> edge : adyacentes) {
            Vertex<LetraColor> destino = edge.getTarget();
            if(!visitados[destino.getPosition()] && !v1.getData().getColor().equals(destino.getData().getColor())){
                if (devolverRecorridoHelper(recorrido, destino, visitados, grafo)) {
                    return true;
                }
            }
        }

        visitados[v1.getPosition()] = false;
        recorrido.removeLast();
        return false;
    }
}
