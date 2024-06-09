package ejercicio6;
import ejercicio1.*;
import java.util.*;

public class BuscadorDeCaminos {
    Graph<String> bosque;
    
    public BuscadorDeCaminos(Graph<String> bosque){
        this.bosque = bosque;
    }
    public List<List<String>> recorridosMasSeguro(){
        List<List<String>> listaCaminos = new LinkedList<List<String>>();

        if(!this.bosque.isEmpty()){
            Vertex<String> casaCaperucita = this.bosque.search("Casa Caperucita");
            Vertex<String> casaAbuelita = this.bosque.search("Casa Abuelita");
            if((casaCaperucita != null) && casaAbuelita != null){
                recorreBosque(casaCaperucita, new boolean[this.bosque.getSize()], listaCaminos, new LinkedList<String>(), casaAbuelita);
            }
        }
        return listaCaminos;
    }

    private void recorreBosque(Vertex<String> v1, boolean[] marca, List<List<String>> listaCaminos, List<String> camAct, Vertex<String> v2){
        // v1 : casa caperucita
        // v2 : casa abuelita
        marca[v1.getPosition()] = true;
        camAct.add(v1.getData());
        if(!v1.getData().equals(v2.getData())) {
            List<Edge<String>> adyacentes = this.bosque.getEdges(v1);
            for (Edge<String> edge : adyacentes) {
                Vertex<String> v = edge.getTarget();
                if (!marca[v.getPosition()] && edge.getWeight() < 5) {
                    recorreBosque(v, marca, listaCaminos, camAct, v2);
                }
            }
        }
        else{
            listaCaminos.add(new LinkedList<String>(camAct));
        }
        marca[v1.getPosition()] = false;
        camAct.removeLast();
    }
}
