package Ejercicio2;
import java.util.*;
import Ejercicio1.GeneralTree;
import Cola.Queue;
public class RecorridoAG {

    /* Recorrido Pre Orden */

    public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree<Integer> a, int n){
        List<Integer> lista = new LinkedList<Integer>();
        if (!a.isEmpty()){
            preOrder(a ,lista, n);
        }
        return lista;
    }

    private void preOrder(GeneralTree<Integer> a, List<Integer> lista, int n){
        if ((a.getData() % 2 != 0) && (a.getData() > n)) lista.add(a.getData());
        List<GeneralTree<Integer>> hijos = a.getChildren();
        for (GeneralTree<Integer> h : hijos){
            preOrder(h, lista, n);
        }
    }

    /* Recorrido In Orden */

    public ArrayList<Integer> numerosImparesMayoresQueInOrden (GeneralTree<Integer> a, int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if (!a.isEmpty()){
            inOrder(a, lista, n);
        }
        return lista;
    }

    private void inOrder(GeneralTree<Integer> a,ArrayList<Integer> lista, int n){
        // Obtener los hijos del nodo actual
        List<GeneralTree<Integer>> hijos = a.getChildren();
        // Si el nodo actual tiene hijos, realiza un recorrido inOrder del primer hijo
        if (a.hasChildren()) inOrder(hijos.get(0), lista, n);
        // Si el dato del nodo actual es impar y mayor que n, lo añade a la lista
        if ((a.getData() % 2 != 0) && (a.getData() > n)) lista.add(a.getData());
        // Recorre los hijos restantes del nodo actual (después del primero) con inOrder
        for (int i = 1; i < hijos.size(); i++){ 
            inOrder(hijos.get(i), lista, n);
        }
    }

    /* Recorrido Post Orden */
    public ArrayList<Integer> numerosImparesMayoresQuePostOrden (GeneralTree<Integer> a, int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if (!a.isEmpty()){
            postOrder(a, lista, n);
        }
        return lista;
    }

    private void postOrder(GeneralTree<Integer> a, List<Integer> lista, int n){
        List<GeneralTree<Integer>> hijos = a.getChildren();
        for (GeneralTree<Integer> h : hijos){
            preOrder(h, lista, n);
        }
        if ((a.getData() % 2 != 0) && (a.getData() > n)) lista.add(a.getData());
    }

    /* Recorrido por niveles */
    
    public List<Integer> porNiveles(GeneralTree<Integer> a, List<Integer> lista, int n){
        List<Integer> resul = new LinkedList<Integer>();
        GeneralTree<Integer> aux;
        Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
        queue.enqueue(a);
        while(!queue.isEmpty()){
            aux = queue.dequeue();
            if(!aux.isEmpty()){
                int dato = a.getData();
                if ((dato % 2 != 0) && (dato > n)) lista.add(dato);
            }
            List<GeneralTree<Integer>> hijos = a.getChildren();
            for(GeneralTree<Integer> h : hijos){
                queue.enqueue(h);
            }
        }
        return resul;
    }

}
