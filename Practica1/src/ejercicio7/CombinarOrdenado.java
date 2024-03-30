package ejercicio7;
import java.util.*;
public class CombinarOrdenado {

    private static void ordenarLista(ArrayList<Integer> l1, ArrayList<Integer> l2){
        l1.sort((o1, o2) -> o1.compareTo(o2));
        l2.sort((o1, o2) -> o1.compareTo(o2));

    }
    private static ArrayList<Integer> combinar(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> nLista = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            if(l1.get(i) < l2.get(j)){
                nLista.add(l1.get(i));
                i++;
            }
            else {
                nLista.add(l2.get(j));
                j++;
            }
        }
        // Agrego elementos restantes
        while (i < l1.size()) {
            nLista.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            nLista.add(l2.get(j));
            j++;
        }
        return nLista;
    }
    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
        ordenarLista(lista1, lista2);
        return combinar(lista1, lista2);
    }
    public static void main(String[] args){
        /* CREO LAS LISTAS */
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista1.add(4); lista1.add(2); lista1.add(6);
        lista2.add(1); lista2.add(7); lista2.add(5);
        
        System.out.println(combinarOrdenado(lista1, lista2));
    }
}
