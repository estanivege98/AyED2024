package ejercicio1.adjList;

import ejercicio1.Edge;
import ejercicio1.Vertex;

public class AdjListEdge<T> implements Edge<T> {
	private Vertex<T> target;
	private int weight;
	
	/**
	 * Crea una arista.  Se invoca desde AdjListGraph.
	 */
	AdjListEdge(Vertex<T> target, int weight){
		this.target = target;
		this.weight = weight;
	}
	
	@Override
	public Vertex<T> getTarget() {
		return target;
	}

	@Override
	public int getWeight() {
		return weight;
	}
}
