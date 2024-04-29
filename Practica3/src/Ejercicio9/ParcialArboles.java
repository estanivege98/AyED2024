package Ejercicio9;
import java.util.*;
import Ejercicio1.GeneralTree;

public class ParcialArboles {
    /*private GeneralTree<Integer> ab;

    public ParcialArboles(GeneralTree<Integer> ab){
        this.ab = ab;
    }*/

    public static boolean esDeSeleccion(GeneralTree<Integer> arbol){
        if(arbol.isEmpty()) return false;
        else return (esDeSeleccionHelper(arbol) ? true : false);
    }
    private static boolean esDeSeleccionHelper(GeneralTree<Integer> arbol){
        int valorMenor = Integer.MAX_VALUE;
        if(!arbol.isLeaf()){
            for(GeneralTree<Integer> hijo : arbol.getChildren()){
                valorMenor = Math.min(valorMenor, hijo.getData());
                if(!esDeSeleccion(hijo)) return false;
            }
        }
        return (valorMenor == arbol.getData());
    }
}
