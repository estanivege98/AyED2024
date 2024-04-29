package Ejercicio6;

import java.util.*;

import Ejercicio1.GeneralTree;

public class RedDeAguaTest {
    public static void main(String[] args){
        //Creo un arbol
        GeneralTree<Character> ab1 = new GeneralTree<Character>('B');

        List<GeneralTree<Character>> subHijos1 = new LinkedList<GeneralTree<Character>>();
        subHijos1.add(new GeneralTree<Character>('L'));
        GeneralTree<Character> subAb2 = new GeneralTree<Character>('G', subHijos1);
        List<GeneralTree<Character>> subHijos2 = new LinkedList<GeneralTree<Character>>();
        subHijos2.add(new GeneralTree<Character>('F'));
        subHijos2.add(subAb2);
        GeneralTree<Character> ab2 = new GeneralTree<Character>('C', subHijos1);

        List<GeneralTree<Character>> subHijos3 = new LinkedList<GeneralTree<Character>>();
        subHijos3.add(new GeneralTree<Character>('M'));
        subHijos3.add(new GeneralTree<Character>('N'));
        GeneralTree<Character> subAb3 = new GeneralTree<Character>('J', subHijos3);
        List<GeneralTree<Character>> subHijos4 = new LinkedList<GeneralTree<Character>>();
        subHijos4.add(new GeneralTree<Character>('H'));
        subHijos4.add(new GeneralTree<Character>('I'));
        subHijos4.add(subAb3);
        subHijos4.add(new GeneralTree<Character>('K'));
        subHijos4.add(new GeneralTree<Character>('P'));
        GeneralTree<Character> ab3 = new GeneralTree<Character>('D', subHijos4);

        GeneralTree<Character> ab4 = new GeneralTree<Character>('E');

        List<GeneralTree<Character>> arbol = new LinkedList<GeneralTree<Character>>();
        arbol.add(ab1);
        arbol.add(ab2);
        arbol.add(ab3);
        arbol.add(ab4);
        GeneralTree<Character> ab5 = new GeneralTree<Character>('A', arbol);

        RedDeAguaPotable red = new RedDeAguaPotable(ab5);
        System.out.println("Caudal minimo que recibe una casa: " + red.minimoCaudal(1000.0));
    }
}

