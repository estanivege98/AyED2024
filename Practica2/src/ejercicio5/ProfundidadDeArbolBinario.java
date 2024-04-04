package ejercicio5;
import java.util.*;

import ejercicio1y2.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;
    public ProfundidadDeArbolBinario(BinaryTree<Integer> a){
        this.arbol = a;
    }

    public int sumaElementosProfundidad(int prof){
        BinaryTree<Integer> ab = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(this);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
        ab = cola.dequeue();
        if (ab != null) {
        System.out.print(ab.getData());
        if (ab.hasLeftChild()) {
        cola.enqueue(ab.getLeftChild());
        }
        if (ab.hasRightChild()) {
        cola.enqueue(ab.getRightChild());
        }
        } else if (!cola.isEmpty()) {
        System.out.println();
        cola.enqueue(null);
        }
    }
 }
        
    }
}
