package Ejercicio8;
import ejercicio1y2.*;
public class TestParcialArboles {
    public static void main(String[] args){
        ParcialArboles pa = new ParcialArboles();

        /* Arbol 1 */
        BinaryTree<Integer> arbol1 = new BinaryTree<Integer>(65);
        arbol1.addLeftChild(new BinaryTree<Integer>(37));
        arbol1.addRightChild(new BinaryTree<Integer>(81));
        arbol1.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
        arbol1.getRightChild().addRightChild(new BinaryTree<Integer>(93));

        /* Arbol 2 */
        BinaryTree<Integer> arbol2 = new BinaryTree<Integer>(65);
        arbol2.addLeftChild(new BinaryTree<Integer>(37));
        arbol2.addRightChild(new BinaryTree<Integer>(81));
        arbol2.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
        arbol2.getLeftChild().addLeftChild(new BinaryTree<Integer>(22));
        arbol2.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(11));
        arbol2.getLeftChild().getLeftChild().addRightChild(new BinaryTree<Integer>(29));
        arbol2.getRightChild().addRightChild(new BinaryTree<Integer>(93));    
        arbol2.getRightChild().addLeftChild(new BinaryTree<Integer>(76));
        arbol2.getRightChild().getRightChild().addLeftChild(new BinaryTree<Integer>(85));
        arbol2.getRightChild().getRightChild().addRightChild(new BinaryTree<Integer>(94));

        /* Imprimo arboles */
        System.out.println("Arbol 1:");
        arbol1.entreNiveles(0, 3);
        System.out.println("Arbol 2:");
        arbol2.entreNiveles(0, 4);

        /* Prubo la clase */
        if(pa.esPrefijo(arbol1, arbol2)){
            System.out.println("Los arboles son prefijo");
        }        
        else{
            System.out.println("Los arboles NO son prefijo");
        }

    }
}
