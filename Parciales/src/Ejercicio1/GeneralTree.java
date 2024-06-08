package Ejercicio1;

import Cola.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	
	

	/* Ejercicio 2 B: Si ahora tuviera que implementar estos métodos en la clase GeneralTree<T>, 
	¿qué modificaciones haría tanto en la firma como en la implementación de los mismos? */  
	
	/* Recorrido PreOrden */
	public List<Integer> numerosImparesMayoresQuePreOrden (int n){
        List<Integer> lista = new LinkedList<Integer>();
        if (!this.isEmpty()){
            this.preOrder(lista, n);
        }
        return lista;
    }
    private void preOrder(List<Integer> lista, int n){
		int dato = (Integer) this.getData();
        if ((dato % 2 != 0) && (dato > n)) lista.add(dato);
        List<GeneralTree<T>> hijos = this.getChildren();
        for (GeneralTree<T> h : hijos){
            h.preOrder(lista, n);
        }
    }

	/* Recorrido InOrden */
	public ArrayList<Integer> numerosImparesMayoresQueInOrden (int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if (!this.isEmpty()){
            this.inOrder(lista, n);
        }
        return lista;
    }
    private void inOrder(ArrayList<Integer> lista, int n){
        // Obtener los hijos del nodo actual
        List<GeneralTree<T>> hijos = this.getChildren();
        if (this.hasChildren()) hijos.get(0).inOrder(lista, n);
		int dato = (Integer) this.getData();
        if ((dato % 2 != 0) && (dato > n)) lista.add(dato);
        
        for (int i = 1; i < hijos.size(); i++){ 
            hijos.get(i).inOrder(lista, n);
        }
    }

	/* Recorrido PostOrden */
	public ArrayList<Integer> numerosImparesMayoresQuePostOrden (int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if (!this.isEmpty()){
            this.postOrder(lista, n);
        }
        return lista;
    }
	private void postOrder(List<Integer> lista, int n){
        List<GeneralTree<T>> hijos = this.getChildren();
        for (GeneralTree<T> h : hijos){
            h.preOrder(lista, n);
        }
		int dato = (Integer) this.getData();
        if ((dato % 2 != 0) && (dato > n)) lista.add(dato);
    }

	/* Recorrido por niveles */
	public List<Integer> porNiveles(GeneralTree<T> a, int n){
		List<Integer> resul = new LinkedList<Integer>();
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
		queue.enqueue(this);
		while (!queue.isEmpty()) {
			aux = queue.dequeue();
			if(!aux.isEmpty()){
				int dato = (Integer) this.getData();
				if ((dato % 2 != 0) && (dato > n)) resul.add(dato);
			}
			List<GeneralTree<T>> hijos = this.getChildren();
			for (GeneralTree<T> h : hijos){
				queue.enqueue(h);
			}
		}
		return resul;
	}

	/* Ejercicio 3
	 * Implemente en la clase GeneralTree los siguientes métodos
		a) public int altura(): int devuelve la altura del árbol, es decir, la longitud del camino más largo
		desde el nodo raíz hasta una hoja.
		
		b) public int nivel(T dato) devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo
		es la longitud del único camino de la raíz al nodo.
		
		c) public int ancho(): int la amplitud (ancho) de un árbol se define como la cantidad de nodos que
		se encuentran en el nivel que posee la mayor cantidad de nodos.
	*/

	public int altura(){
		return (!this.isEmpty()) ? alturaHelper() : -1;
	}
	private int alturaHelper(){
		if(this.isLeaf()) return 0;
		else{
			int alMax = -1;
			List<GeneralTree<T>> hijos = this.getChildren();
			for (GeneralTree<T> h : hijos){
				alMax = Math.max(alMax, h.alturaHelper());
			}
			return alMax + 1;
		}
	} 

	public int nivel(T dato){
		if(this.isEmpty()){
			return 0;
		}
		else return (!this.isLeaf() ? nivelHelper(dato) : 1);
    }
	private int nivelHelper(T dato){
		Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
		queue.enqueue(this);
		int prof = 0;
		while (!queue.isEmpty()){
			int levelSize = queue.size();
			for (int i = 0; i < levelSize; i++){
				GeneralTree<T> actual = queue.dequeue();
				if (actual.getData().equals(dato)){
					return prof; // Se encuentra el dato, devuelve la profundidad
				}
				// Agrega los hijos del nodo actual a la cola
				for (GeneralTree<T> h : actual.getChildren()){
					queue.enqueue(h);
				}
			}
			prof++; // Incrementa la profundidad despues de explorer todos los nodos en el nivel actual 
		}
		return -1; // El dato no se encontro en el arbol
	}

	public int ancho(){
		if(this.isEmpty()){
			return 0;
		}
		else return (!this.isLeaf() ? anchoHelper() : 1); 
	}
	private int anchoHelper(){
		int cantMax = 0;
		int cantActual = 0;
		GeneralTree<T> ab;
		Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
		queue.enqueue(this);
		queue.enqueue(null);
		while(!queue.isEmpty()){
			ab = queue.dequeue();
			if(ab!=null){
				List<GeneralTree<T>> hijos = this.getChildren();
				for(GeneralTree<T> h : hijos){
					queue.enqueue(h);
					cantActual++;
				}
			}
			else if(!queue.isEmpty()){
				cantMax = Math.max(cantMax, cantActual);
				cantActual = 0;
				queue.enqueue(null);
			}
		}
		return cantMax;
	}

	/* Ejercicio 5
	Se dice que un nodo n es ancestro de un nodo m si existe un camino desde n a m. Implemente un
	método en la clase GeneralTree con la siguiente firma: */
	public boolean esAncestro(T a, T b){  /*devuelve true si el valor “a” es ancestro del valor “b”- */
		if (this.isEmpty()){
			return false;
		}
		else return ancestroBusqueda(this,a,b);
	} 
	// Método auxiliar recursivo para buscar el nodo con valor 'data' y verificar si es ancestro de 'b'
	private boolean ancestroBusqueda(GeneralTree<T> nodo,T a, T b){
		/* if (nodo == null) {
			return false;
		}*/ 
		// Verifica si 'a' es ancestro de 'b' a partir del nodo actual
		if(nodo.getData().equals(a)){
			return ancestroHelper(nodo, b);
		}
		// Buscar en los hijos del nodo actual
		for (GeneralTree<T> child : nodo.getChildren()){
			if (ancestroBusqueda(child, a, b)){
				return true;
			}
		}
		return false;
	}
	// Método auxiliar recursivo para verificar si 'a' es ancestro de 'b'
	private boolean ancestroHelper(GeneralTree<T> a, T b){
		// Si 'a' es igual a 'b', entonces 'a' es ancestro de sí mismo
		if(a.getData().equals(b)){
			return true;
		}
		// Verificar si 'a' es ancestro de algún hijo de 'b'
		for (GeneralTree<T> child : a.getChildren()){
			if(ancestroHelper(child, b)){
				return true;
			}
		}
		return false;
	}
}
