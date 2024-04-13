package Ejercicio6;

import ejercicio1y2.BinaryTree;

public class Transformacion {
    
    private BinaryTree<Integer> ab;

    public Transformacion(BinaryTree<Integer> arbolBinario){
        this.ab = arbolBinario;
    }


    public BinaryTree<Integer> getAb(){
        return ab;
    }

    /**
     * Este método inicia la transformación del árbol binario almacenado.
     * Si el árbol no es nulo, procede a sumar los valores de sus subárboles.
     */
    public void realizarTransformacion(){
        if (this.ab != null){
            sumarSubarbol(ab);
        }
    }

    /**
     * Calcula la suma de todos los nodos de un subárbol y actualiza el valor de cada nodo con la suma de los valores de sus nodos hijos más su propio valor.
     * @param arbol El subárbol a sumar.
     * @return La suma total de los valores de los nodos del subárbol.
     */
    private int sumarSubarbol(BinaryTree<Integer> arbol){
        int sumaTotal = 0;
        // Si el árbol es nulo, retorna 0.
        if (arbol == null){
            return 0;
        }
        // Si el nodo es una hoja, guarda su valor, lo actualiza a 0 y retorna su valor original.
        if (arbol.isLeaf()){
            sumaTotal = arbol.getData();
            arbol.setData(0);
            return sumaTotal;
        }
        
        // Calcula la suma de los subárboles izquierdo y derecho.
        int sumIzquierdo = sumarSubarbol(arbol.getLeftChild());
        int sumDerecho = sumarSubarbol(arbol.getRightChild());
        
        // La suma total es la suma de los subárboles más el valor del nodo actual.
        // Actualiza el valor del nodo actual con la suma total.
        sumaTotal = sumIzquierdo + sumDerecho + arbol.getData();
        arbol.setData(sumaTotal);
        
        return sumaTotal;
    }
    
}
