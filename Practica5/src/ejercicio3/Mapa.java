/* 1. devolverCamino (String ciudad1, String ciudad2): List<String>
Retorna la lista de ciudades que se deben atravesar para ir de ciudad1 a ciudad2 en caso de que se
pueda llegar, si no retorna la lista vacía. (Sin tener en cuenta el combustible).
2. devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades): List<String>
Retorna la lista de ciudades que forman un camino desde ciudad1 a ciudad2, sin pasar por las ciudades
que están contenidas en la lista ciudades pasada por parámetro, si no existe camino retorna la lista
vacía. (Sin tener en cuenta el combustible).
3. caminoMasCorto(String ciudad1, String ciudad2): List<String>
Retorna la lista de ciudades que forman el camino más corto para llegar de ciudad1 a ciudad2, si no
existe camino retorna la lista vacía. (Las rutas poseen la distancia).
4. caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto): List<String>
Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2. El auto no debe
quedarse sin combustible y no puede cargar. Si no existe camino retorna la lista vacía.
5. caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto): List<String>
Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2 teniendo en cuenta
que el auto debe cargar la menor cantidad de veces. El auto no se debe quedar sin combustible en
medio de una ruta, además puede completar su tanque al llegar a cualquier ciudad. Si no existe camino
retorna la lista vacía. */

package ejercicio3;
import java.util.*;
import ejercicio1.*;
import ejercicio1.adjList.AdjListGraph;


public class Mapa {
    private final Graph<String> mapaCiudades;

    public Mapa(){
        this.mapaCiudades = new AdjListGraph<>();
    }

    public List<String> devolverCamino(String ciudad1, String ciudad2){
        List<String> camino = new ArrayList<String>();
        Vertex<String> v1 = this.mapaCiudades.search(ciudad1);
        Vertex<String> v2 = this.mapaCiudades.search(ciudad2);
        boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
        if(v1 != null && v2 != null){
            devolverCaminoHelper(v1, v2, visitados, camino);
        }
        return camino;
    }
    private boolean devolverCaminoHelper(Vertex<String> v1, Vertex<String> v2, boolean[] visitados, List<String> camino){
        visitados[v1.getPosition()] = true;
        camino.add(v1.getData());
        if (v1 == v2) {
            return false;
        }
        boolean paro = false;
        if(!v1.getData().equals(v2.getData()) && !paro){
            List<Edge<String>> adyacentes = this.mapaCiudades.getEdges(v1);
            for (Edge<String> edge : adyacentes) {
                Vertex<String> v = edge.getTarget();
                if(!visitados[v.getPosition()]){
                    paro = devolverCaminoHelper(v, v2, visitados, camino);
                }
            }
        }
        if (paro) return false;

        camino.removeLast();
        return true;
    }

}
