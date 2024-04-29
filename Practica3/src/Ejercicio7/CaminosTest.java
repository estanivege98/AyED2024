package Ejercicio7;

import java.util.*;

import Ejercicio1.GeneralTree;

public class CaminosTest {
    public static void main(String[] args){
        // Creo el arbol
        List<GeneralTree<Integer>> subHijos1 = new LinkedList<GeneralTree<Integer>>();
        subHijos1.add(new GeneralTree<Integer>(1));
        GeneralTree<Integer> subAb1 = new GeneralTree<Integer>(6, subHijos1);
        List<GeneralTree<Integer>> subHijos2 = new LinkedList<GeneralTree<Integer>>();
        subHijos2.add(new GeneralTree<Integer>(10));
        subHijos2.add(subAb1);
        GeneralTree<Integer> subAb2 = new GeneralTree<Integer>(17, subHijos2);

        List<GeneralTree<Integer>> subHijos3 = new LinkedList<GeneralTree<Integer>>();
        subHijos3.add(new GeneralTree<Integer>(8));
        GeneralTree<Integer> subAb3 = new GeneralTree<Integer>(9);

        List<GeneralTree<Integer>> subHijos4 = new LinkedList<GeneralTree<Integer>>();
        subHijos4.add(new GeneralTree<Integer>(16));
        subHijos4.add(new GeneralTree<Integer>(7));
        GeneralTree<Integer> subAb4 = new GeneralTree<Integer>(14, subHijos4);
        List<GeneralTree<Integer>> subHijos5 = new LinkedList<GeneralTree<Integer>>();
        subHijos5.add(subAb4);
        subHijos5.add(new GeneralTree<Integer>(18));
        GeneralTree<Integer> subAb5 = new GeneralTree<Integer>(15, subHijos5);

        List<GeneralTree<Integer>> arbol = new LinkedList<GeneralTree<Integer>>();
        arbol.add(subAb2);
        arbol.add(subAb3);
        arbol.add(subAb5);
        GeneralTree<Integer> ab = new GeneralTree<Integer>(12, arbol);

        Caminos camino = new Caminos(ab);
        System.out.println("Camino a hoja mas lejana" + camino.caminoAHojaMasLejana());
    }
}
