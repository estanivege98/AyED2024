package ejercicio3;

import ejercicio1y2.BinaryTree;
import java.util.*;

public class ContadorArbol {

    private LinkedList<Integer> paresInOrden(BinaryTree<Integer> arbol, LinkedList<Integer> lista){
        if (arbol.hasLeftChild()){
            paresInOrden(arbol.getLeftChild(), lista);
        }
        if ((arbol.getData() % 2) == 0){
            lista.addLast(arbol.getData());
        }
        if (arbol.hasRightChild()){
            paresInOrden(arbol.getRightChild(), lista);
        }
        return lista;
    }
    
    private LinkedList<Integer> paresPostOrden(BinaryTree<Integer> arbol, LinkedList<Integer> lista){
        if (arbol.hasLeftChild()){
            paresPostOrden(arbol.getLeftChild(), lista);
        }
        if (arbol.hasRightChild()){
            paresPostOrden(arbol.getRightChild(), lista);
        }
        if ((arbol.getData() % 2) == 0){
            lista.addLast(arbol.getData());
        }
        return lista;
    }

    public LinkedList<Integer> numerosParesInOrden(BinaryTree<Integer> arbol){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        this.paresInOrden(arbol, lista);
        return lista;
    }
    public LinkedList<Integer> numerosParesPostOrden(BinaryTree<Integer> arbol){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        this.paresPostOrden(arbol, lista);
        return lista;
    }

}
