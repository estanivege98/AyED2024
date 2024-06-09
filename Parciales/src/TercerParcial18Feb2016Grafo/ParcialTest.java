package TercerParcial18Feb2016Grafo;
import java.util.*;
import Graph.*;
import Graph.adjList.AdjListGraph;

import static org.junit.jupiter.api.Assertions.*;
public class ParcialTest {
    @org.junit.Test
    public void testRecorridosMasSeguro(){
        Graph<LetraColor> grafo = new AdjListGraph<>();
        Vertex<LetraColor> v1 = grafo.createVertex(new LetraColor("A", "Blanco"));
        Vertex<LetraColor> v2 = grafo.createVertex(new LetraColor("B", "Blanco"));
        Vertex<LetraColor> v3 = grafo.createVertex(new LetraColor("F", "Blanco"));
        Vertex<LetraColor> v4 = grafo.createVertex(new LetraColor("G", "Gris"));
        Vertex<LetraColor> v5 = grafo.createVertex(new LetraColor("C", "Blanco"));
        Vertex<LetraColor> v6 = grafo.createVertex(new LetraColor("E", "Gris"));
        Vertex<LetraColor> v7 = grafo.createVertex(new LetraColor("D", "Gris"));

        grafo.connect(v1, v2);
        grafo.connect(v2, v5);
        grafo.connect(v5, v7);
        grafo.connect(v7, v6);
        grafo.connect(v6, v3);
        grafo.connect(v3, v1);

        grafo.connect(v2, v1);
        grafo.connect(v5, v2);
        grafo.connect(v7, v5);
        grafo.connect(v6, v7);
        grafo.connect(v3, v6);
        grafo.connect(v1, v3);

        grafo.connect(v1, v4);
        grafo.connect(v4, v1);
        grafo.connect(v4, v2);
        grafo.connect(v2, v4);
        grafo.connect(v4, v3);
        grafo.connect(v3, v4);
        grafo.connect(v4, v5);
        grafo.connect(v5, v4);
        grafo.connect(v4, v6);
        grafo.connect(v6, v4);
        grafo.connect(v4, v7);
        grafo.connect(v7, v4);

        Parcial par = new Parcial();
        List<String> camino = par.devolverRecorrido(grafo);

        // Verifico que el camino sea el correcto
        List<String> expectedOrder = List.of("A", "G", "C", "D");
        assertEquals(expectedOrder, camino);
    }
}
