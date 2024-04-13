package Ejercicio7;
import ejercicio1y2.*;
public class ParcialArboles {
    /**
     * This code defines a class ParcialArboles that works with binary trees.
     * It includes methods to count the number of child nodes, determine if a tree is leaning to the left, and search for a specific node in the tree.
     */

    private BinaryTree<Integer> ab;

    public ParcialArboles(BinaryTree<Integer> arbol){
        this.ab = arbol;
    }

    /**
     * Counts the number of child nodes in a given binary tree.
     * @param ab The binary tree to count child nodes from.
     * @return The total number of child nodes.
     */
    private int contarHijo(BinaryTree<Integer> ab){
        int cant = 0;
        if(ab.hasLeftChild()) cant += contarHijo(ab.getLeftChild());
        if(ab.hasRightChild()) cant += contarHijo(ab.getRightChild()); 
        if ((ab.hasLeftChild() && !ab.hasRightChild()) || (!ab.hasLeftChild() && ab.hasRightChild())) {
            cant++;
        }
        return cant;
    }

    /**
     * Checks if a binary tree is leaning to the left.
     * @param ab The binary tree to check.
     * @return True if the tree is leaning to the left, false otherwise.
     */
    private boolean isLeftTree(BinaryTree<Integer> ab){
        int raIzq = -1;
        int raDer = -1;
        if(ab.hasLeftChild()) {
            raIzq = contarHijo(ab.getLeftChild());
        }
        if(ab.hasRightChild()) {
            raDer = contarHijo(ab.getRightChild());
        }
        return raIzq > raDer;
    }

    /**
     * Searches for a specific node in the binary tree.
     * @param ab The binary tree to search in.
     * @param num The number to search for.
     * @return The node containing the specified number, or an empty tree if not found.
     */
    private BinaryTree<Integer> busqueda(BinaryTree<Integer> ab, int num){
        if(ab.getData() == num) return ab; // If the data of the tree is the number, return the tree
        BinaryTree<Integer> res = new BinaryTree<Integer>();
        if(ab.hasLeftChild()){
           res = busqueda(ab.getLeftChild(), num);
        }
        if((ab.hasRightChild()) && (res.isEmpty())){
            res = busqueda(ab.getRightChild(), num);
        }
        return res;
    }

    /**
     * Checks if a specific number is in a left-leaning tree.
     * @param num The number to search for.
     * @return True if the number is in a left-leaning tree, false otherwise.
     */
    public boolean isLeftTree(int num){
        BinaryTree<Integer> suma = busqueda(ab, num);
        return (!ab.isEmpty()) ? isLeftTree(suma) : false;
    }
}
