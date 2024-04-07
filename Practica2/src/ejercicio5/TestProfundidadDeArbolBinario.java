package ejercicio5;

import ejercicio1y2.BinaryTree;

public class TestProfundidadDeArbolBinario {
    public static void main(String[] args){
    BinaryTree<Integer> arbol = new BinaryTree<Integer>(1);
    ProfundidadDeArbolBinario calculador = new ProfundidadDeArbolBinario(arbol);

    // Construimos el árbol
    arbol.addLeftChild(new BinaryTree<Integer>(2));
    arbol.addRightChild(new BinaryTree<Integer>(3));
    arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
    arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
    arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(6));
    arbol.getRightChild().addRightChild(new BinaryTree<Integer>(7));

    // Probamos el método sumaElementosProfundidad
    int profundidad = 2;
    int suma = calculador.sumaElementosProfundidad(profundidad);
    System.out.println("La suma de los elementos en la profundidad " + profundidad + " es: " + suma);
    }
}
