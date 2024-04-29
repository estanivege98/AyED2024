package Ejercicio9;
import java.util.*;
import Ejercicio1.GeneralTree;
public class ParcialArbolesTest {
    public static void main(String[] args){
        // Creo primer arbol del ejemplo
        List<GeneralTree<Integer>> subHijos1 = new LinkedList<GeneralTree<Integer>>();
        subHijos1.add(new GeneralTree<Integer>(35));
        GeneralTree<Integer> subArbol1 = new GeneralTree<Integer>(35, subHijos1);
        List<GeneralTree<Integer>> subHijos2 = new LinkedList<GeneralTree<Integer>>();
        subHijos2.add(new GeneralTree<Integer>(35));
        subHijos2.add(subArbol1);
        GeneralTree<Integer> subArbol2 = new GeneralTree<Integer>(35, subHijos2);
        
        List<GeneralTree<Integer>> subHijos3 = new LinkedList<GeneralTree<Integer>>();
        subHijos3.add(new GeneralTree<Integer>(35));
        subHijos3.add(new GeneralTree<Integer>(83));
        subHijos3.add(new GeneralTree<Integer>(90));
        subHijos3.add(new GeneralTree<Integer>(33));
        GeneralTree<Integer> subArbol3 = new GeneralTree<Integer>(33, subHijos3);
        List<GeneralTree<Integer>> subHijos4 = new LinkedList<GeneralTree<Integer>>();
        subHijos4.add(new GeneralTree<Integer>(14));
        subHijos4.add(new GeneralTree<Integer>(12));
        subHijos4.add(subArbol3);
        GeneralTree<Integer> subArbol4 = new GeneralTree<Integer>(12, subHijos4);

        List<GeneralTree<Integer>> subHijos5 = new LinkedList<GeneralTree<Integer>>();
        subHijos5.add(subArbol2);
        subHijos5.add(subArbol4);
        GeneralTree<Integer> subArbol5 = new GeneralTree<Integer>(12, subHijos5);

        List<GeneralTree<Integer>> subHijos6 = new LinkedList<GeneralTree<Integer>>();
        subHijos6.add(new GeneralTree<Integer>(25));
        GeneralTree<Integer> subArbol6 = new GeneralTree<Integer>(25, subHijos6);

        List<GeneralTree<Integer>> hijos = new LinkedList<GeneralTree<Integer>>();
        hijos.add(subArbol5);
        hijos.add(subArbol6);
        GeneralTree<Integer> arbol1 = new GeneralTree<Integer>(12, hijos);

        //ParcialArboles pa = new ParcialArboles();
        System.out.println(ParcialArboles.esDeSeleccion(arbol1) ? "Yes" : "No");
    }
}
