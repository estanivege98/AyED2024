package ejercicio6;
import java.util.*;
import ejercicio1.*;
import ejercicio1.adjList.AdjListGraph;

import static org.junit.jupiter.api.Assertions.*;
public class BuscadorDeCaminosTest {

    @org.junit.Test
    public void testRecorridosMasSeguro(){
        Graph<String> bosque = new AdjListGraph<>();
        Vertex<String> casaCaperucita = bosque.createVertex("Casa Caperucita");
        Vertex<String> claro1 = bosque.createVertex("Claro 1");
        Vertex<String> claro2 = bosque.createVertex("Claro 2");
        Vertex<String> claro3 = bosque.createVertex("Claro 3");
        Vertex<String> claro4 = bosque.createVertex("Claro 4");
        Vertex<String> claro5 = bosque.createVertex("Claro 5");
        Vertex<String> casaAbuelita = bosque.createVertex("Casa Abuelita");

        bosque.connect(casaCaperucita, claro3, 4);
        bosque.connect(casaCaperucita, claro1, 3);
        bosque.connect(casaCaperucita, claro2, 4);
        bosque.connect(claro3, claro5, 15);
        bosque.connect(claro1, claro5, 3);
        bosque.connect(claro2, claro5, 11);
        bosque.connect(claro2, claro1, 4);
        bosque.connect(claro2, claro4, 10);
        bosque.connect(claro5, casaAbuelita, 4);
        bosque.connect(claro4, casaAbuelita, 9);

        BuscadorDeCaminos buscador = new BuscadorDeCaminos(bosque);
        List<List<String>> caminos = buscador.recorridosMasSeguro();
        assertEquals(2, caminos.size());
    }
}
