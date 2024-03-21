package ejercicio7;

import java.util.*;
public class TestArrayList {
    public static void main(String[] args){
        /* INCISO A */
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("INCISO A");
        for (int i = 0; i< args.length; i++){
            lista.add(Integer.parseInt(args[i]));
        }
        System.out.println("Imprimiendo Lista:");
        for (int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println();
        
        /* INCISO D */
        System.out.println("INCISO D");


        in.close();
    }
}
