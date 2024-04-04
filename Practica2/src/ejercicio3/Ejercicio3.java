package ejercicio3;
import java.util.*;
import ejercicio1y2.BinaryTree;
public class Ejercicio3 {

    /* Quiero armar el siguiente arbol */
    //      10
    //     /  \
    //    5    8
    //   /    / \
    //  20   14 37
    public static void main(String[] args){
        /* Defino los numeros que formaran el arbol binario */
        BinaryTree<Integer> num10 = new BinaryTree<Integer>(10);
        BinaryTree<Integer> num5 = new BinaryTree<Integer>(5);
        BinaryTree<Integer> num8 = new BinaryTree<Integer>(8);
        BinaryTree<Integer> num20 = new BinaryTree<Integer>(20);
        BinaryTree<Integer> num14 = new BinaryTree<Integer>(14);
        BinaryTree<Integer> num37 = new BinaryTree<Integer>(37);

        /* Armo el arbol */
        num10.addLeftChild(num5);
        num10.addRightChild(num8);
        num5.addLeftChild(num20);
        num8.addLeftChild(num14);
        num8.addRightChild(num37);

        System.out.println("---- In Orden ----");
        ContadorArbol cont = new ContadorArbol();
        LinkedList<Integer> lista = cont.numerosParesInOrden(num10);
        for (Integer n : lista){
            System.out.println(n);
        }
        System.out.println("");
        System.out.println("---- Post Orden ----");
        LinkedList<Integer> lista1 = cont.numerosParesPostOrden(num10);
        for (Integer n : lista1){
            System.out.println(n);
        }
    }
}
