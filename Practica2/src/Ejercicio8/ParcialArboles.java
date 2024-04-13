package Ejercicio8;

import ejercicio1y2.BinaryTree;

public class ParcialArboles {
    /* Primero pregunta si alguno de los dos arboles esta vacio, entonces luego pregunta 
     * si ambos arobles estan vacios y devuelve true si es asi.
     * Si ambos no son vacios, entonces llama a 'esPrefijo1'.
     */
    public boolean esPrefijo(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2){
        if (ab1.isEmpty() || ab2.isEmpty()) {
            return ab1.isEmpty() && ab2.isEmpty();
        }
        return esPrefijo1(ab1, ab2);
    }

    private boolean esPrefijo1(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2){
        
        if (ab1.getData() != ab2.getData()){ 
            return false; // Retorno false si los datos son distintos entre si
        }
        
        boolean res = true; // Devuelve true si coinciden las estructuras
        
        if (ab1.hasLeftChild()){
            if(ab2.hasLeftChild()){
                res = res && (esPrefijo1(ab1.getLeftChild(), ab2.getLeftChild())); /* Si el arbol 1 y 2 tienen hijo izquiedo, sigo verificando que posean la misma estructura */
            }
            else {
                return false; /* Devuelvo false si difieren */
            }
        }
        
        
        if (ab1.hasRightChild()){
            if(ab2.hasRightChild()){
                res = res && (esPrefijo1(ab1.getRightChild(), ab2.getRightChild())); /* Idem pero con hijo derecho */
            }
            else{
                return false;
            }
        }

        return res;
    }
}
