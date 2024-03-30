package ejercicio7;
import java.util.*;
public class SumarLista {

    /* METODOS */

    private static int sumarLinkedListRec(LinkedList<Integer> lista, int pri){
        //int suma = 0;
        if (pri < lista.size() -1){
            return lista.get(pri) + sumarLinkedListRec(lista, pri+1);
        }
        return lista.get(pri);
    }
    public static int sumarLinkedList(LinkedList<Integer> lista, int pri){
       
        return sumarLinkedListRec(lista, 0); 
    }
    public static void main(String[] args){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        /* IMPLEMENTO METODO DE SUMA */
        System.out.println(sumarLinkedList(lista,0));
    }
}
