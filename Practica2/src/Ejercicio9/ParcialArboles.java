package Ejercicio9;

import java.util.*;

import ejercicio1y2.BinaryTree;

/**
 * Esta clase ParcialArboles contiene métodos para realizar operaciones de suma y diferencia en un árbol binario.
 */
public class ParcialArboles {

    /**
     * Realiza la operación de suma y diferencia en un árbol binario.
     * @param ab El árbol binario de enteros en el que se realizará la operación.
     * @return Un nuevo árbol binario que contiene listas de enteros con la suma y diferencia acumuladas.
     */
    public BinaryTree<ArrayList<Integer>> sumAndDif(BinaryTree<Integer> ab){
        if(ab.isEmpty()){
            return null;
        }
        else{
            /* Creo un vector interno del arbol nuevo */
            ArrayList<Integer> vecInterno = new ArrayList<Integer>(2);
            /* Inicializo el vector, 0 es suma y 1 es diferencia */
            vecInterno.add(0);
            vecInterno.add(0);
            /* Creo el arbol nuevo */
            BinaryTree<ArrayList<Integer>> newArbol = new BinaryTree<ArrayList<Integer>>();
            sumAndDif1(ab, newArbol, vecInterno, ab.getData());
            return newArbol;
        }
        
    }

    private BinaryTree<ArrayList<Integer>> sumAndDif1(BinaryTree<Integer> ab, BinaryTree<ArrayList<Integer>> abNew, ArrayList<Integer> vec, int datoAnterior){
        int datoAct = ab.getData();
        int valorEnVecSuma = vec.get(0);
        int valorEnVecResta = vec.get(1);
        int suma = datoAct + valorEnVecSuma;
        int resta = datoAct;
        if (ab.getData() != datoAnterior){
            resta -= datoAnterior;
        }
        
        vec.set(0, suma);
        vec.set(1, resta);
        abNew.setData(vec);
        if(ab.hasLeftChild()){
            BinaryTree<ArrayList<Integer>> nuevoIzquierdo = new BinaryTree<ArrayList<Integer>>();
            abNew.addLeftChild(nuevoIzquierdo);
            sumAndDif1(ab.getLeftChild(), nuevoIzquierdo, new ArrayList<>(vec), ab.getData());
        }
        if(ab.hasRightChild()){
            BinaryTree<ArrayList<Integer>> nuevoDerecho = new BinaryTree<ArrayList<Integer>>();
            abNew.addRightChild(nuevoDerecho);
            sumAndDif1(ab.getRightChild(), nuevoDerecho, new ArrayList<>(vec), ab.getData());
        }
        return abNew;
    }
}
