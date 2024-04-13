package Ejercicio9;

import ejercicio1y2.BinaryTree;
import java.util.*;
public class TestParcialArboles {
    public static void main(String[] args){
        System.out.println("Test Ejercicio 9");
        ParcialArboles pa = new ParcialArboles();

        /* Armo el arbol */
        BinaryTree<Integer> ab = new BinaryTree<Integer>(20);
        ab.addLeftChild(new BinaryTree<Integer>(5));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(-5));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(10));
        ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(1));
        ab.addRightChild(new BinaryTree<Integer>(30));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(50));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(-9));
        ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        ab.getRightChild().getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(6));

        /* Imprimo arbol original */
        ab.entreNiveles(0, 5);
        System.out.println();
        
        /* Realizo la suma y diferencia */
        BinaryTree<ArrayList<Integer>> abNew = pa.sumAndDif(ab);
        abNew.entreNiveles(0, 5);
        System.out.println();
    }
}
