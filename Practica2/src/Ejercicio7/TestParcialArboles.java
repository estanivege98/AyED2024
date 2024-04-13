package Ejercicio7;

import ejercicio1y2.BinaryTree;

public class TestParcialArboles {
    public static void main(String[] args){
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(2);
        arbol.addLeftChild(new BinaryTree<Integer>(7));
        arbol.addRightChild(new BinaryTree<Integer>(-5));
        arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(23));
        arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(6));
        arbol.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(-3));
        arbol.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(55));
        arbol.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(11));
        arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(19));
        arbol.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        arbol.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(18));

        arbol.entreNiveles(0, 4);

        ParcialArboles pa = new ParcialArboles(arbol);
        System.out.println("Resultado=" + pa.isLeftTree(7));
        System.out.println("Resultado=" + pa.isLeftTree(2));
        System.out.println("Resultado=" + pa.isLeftTree(-5));
        System.out.println("Resultado=" + pa.isLeftTree(19));
        System.out.println("Resultado=" + pa.isLeftTree(-3));
    } 
}
