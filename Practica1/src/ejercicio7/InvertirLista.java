package ejercicio7;
import java.util.*;
public class InvertirLista {
    private static void invertirArrayListRec(ArrayList<Integer> lista, int pri, int ult){
        if(pri < ult){
            int tmp = lista.get(pri);
            lista.set(pri, lista.get(ult));
            lista.set(ult, tmp);
            invertirArrayListRec(lista, pri+1, ult-1);
        }
    }
    public static void invertirArrayList(ArrayList<Integer> lista){
        invertirArrayListRec(lista, 0, lista.size() -1);
    }

    public static void main(String[] args){
        /* Genero lista */
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        System.out.println("Lista original:");
        for(int e: lista){
            System.out.println(e);
        }
        System.out.println("Invirtiendo Lista");
        /* Invierto lista con el metodo "invertirArrayList" */
        invertirArrayList(lista);
        for(int e: lista){
            System.out.println(e);
        }
    }
}
