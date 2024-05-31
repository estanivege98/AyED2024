package Ejercicio2;
import java.util.*;
import ejercicio1.*;
public class Recorridos<T> {

    public List<T> dfs(Graph<T> grafo, Vertex<T> vertice, boolean[] visitados, List<T> camino){
        visitados[vertice.getPosition()] = true;
        camino.addLast(vertice.getData());
        List<Edge<T>> adyacentes = grafo.getEdges(vertice);

    }
}
