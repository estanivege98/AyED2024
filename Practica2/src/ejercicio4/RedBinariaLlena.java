package ejercicio4;
import java.util.*;
import ejercicio1y2.BinaryTree;
public class RedBinariaLlena {

   /* public int retardoReenvio(BinaryTree<Integer> arbol){
        if(arbol.isLeaf()){
            return arbol.getData();
        }
        int suma = 0;
        if(arbol.hasLeftChild()){
            suma += retardoReenvio(arbol.getLeftChild());
        }
        if(arbol.hasRightChild()){
            suma += retardoReenvio(arbol.getRightChild());
        }
        return suma;
    }*/

    private int retardoReenvioRec(BinaryTree<Integer> arbol, int retardo){
        if(arbol.isLeaf()){
            return arbol.getData() + retardo;
        }
        int retardoIzquierdo = retardoReenvioRec(arbol.getLeftChild(), arbol.getData() + retardo);
        int retardoDerecho = retardoReenvioRec(arbol.getRightChild(), arbol.getData() + retardo);

        return Math.max(retardoIzquierdo, retardoDerecho);
    }
    public int retardoReenvio(BinaryTree<Integer> arbol){
       return retardoReenvioRec(arbol, 0);
    }
}
