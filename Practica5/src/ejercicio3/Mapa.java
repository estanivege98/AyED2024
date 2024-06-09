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
        Vertex<String> v3;
        boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
        if(v1 != null && v2 != null){
            boolean[] visitados2 = new boolean[this.mapaCiudades.getSize()];
            v3 = buscarCiudad(v1, ciudad1, visitados2);
        }
        else{
            return new ArrayList<>();
        }
        buscarCiudad2(v3, ciudad2, visitados, camino);
        return camino;
    }
    private Vertex<String> buscarCiudad(Vertex<String> v, String ciudad, boolean[] visitados){
        visitados[v.getPosition()] = true;
        if(v.getData().equals(ciudad)){
            return v;
        }
        List<Edge<String>> adyacentes = this.mapaCiudades.getEdges(v);
        for (Edge<String> edge : adyacentes) {
            Vertex<String> v2 = edge.getTarget();
            if(!visitados[v2.getPosition()]){
                buscarCiudad(v2, ciudad, visitados);
            }
        }
        return v;
    }
    private boolean buscarCiudad2(Vertex<String> v, String ciudad, boolean[] visitados, List<String> camino){
        visitados[v.getPosition()] = true;
        camino.add(v.getData());
        if(v.getData().equals(ciudad)){
            return true;
        }
        List<Edge<String>> adyacentes = this.mapaCiudades.getEdges(v);
        for (Edge<String> edge : adyacentes) {
            Vertex<String> v2 = edge.getTarget();
            if(!visitados[v2.getPosition()]){
                boolean encuentra = buscarCiudad2(v2, ciudad, visitados, camino);
                if (encuentra){
                    return true;
                }
            }
        }
        camino.removeLast();
        return false;
    }


}
