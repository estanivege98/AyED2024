package ejercicio5;
import java.util.LinkedList;
import java.util.Queue;
import ejercicio1y2.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;

    public ProfundidadDeArbolBinario(BinaryTree<Integer> a){
        this.arbol = a;
    }

    public int sumaElementosProfundidad(int prof){
        if (arbol == null) return 0; // Si el árbol está vacío, retorna 0.

        Queue<BinaryTree<Integer>> cola = new LinkedList<>();
        int suma = 0;
        int profundidadActual = 0;

        cola.add(arbol); // Añade el nodo raíz a la cola.
        cola.add(null); // Marcador de fin de nivel.

        while (!cola.isEmpty()) {
            BinaryTree<Integer> nodoActual = cola.poll();

            if (nodoActual == null) {
                profundidadActual++; // Incrementa la profundidad cuando se alcanza el fin de un nivel.
                if (!cola.isEmpty()) {
                    cola.add(null); // Añade un nuevo marcador de fin de nivel si la cola no está vacía.
                }
            } else {
                if (profundidadActual == prof) {
                    suma += nodoActual.getData(); // Suma los valores de los nodos a la profundidad especificada.
                }
                if (nodoActual.hasLeftChild()) {
                    cola.add(nodoActual.getLeftChild()); // Añade el hijo izquierdo a la cola si existe.
                }
                if (nodoActual.hasRightChild()) {
                    cola.add(nodoActual.getRightChild()); // Añade el hijo derecho a la cola si existe.
                }
            }
        }
        return suma;
    }
}

