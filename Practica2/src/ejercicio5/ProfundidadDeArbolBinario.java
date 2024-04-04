package ejercicio5;
import java.util.*;
import Cola.Queue;
import ejercicio1y2.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;
    public ProfundidadDeArbolBinario(BinaryTree<Integer> a){
        this.arbol = a;
    }

    public int sumaElementosProfundidad(int prof){
        BinaryTree<Integer> ab = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        int suma = 0;
        int profundidadActual = 0;
        cola.enqueue(arbol);
        cola.enqueue(null);
        while (!cola.isEmpty() && profundidadActual <= prof) {
            ab = cola.dequeue();
            if (ab != null) {
                suma += ab.getData(); 
            }
            if (ab.hasLeftChild()) {
                cola.enqueue(ab.getLeftChild());
            }
            if (ab.hasRightChild()) {
                cola.enqueue(ab.getRightChild());
            }
        else{
        profundidadActual++; 
        if (!cola.isEmpty()) {
            cola.enqueue(null);
        }   
        }
    
    }
return suma;
}
        
}

