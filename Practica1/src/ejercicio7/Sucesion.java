package ejercicio7;
import java.util.*;
public class Sucesion {

    private static void calcularSucesionRec(List<Integer> lista, int n){
        lista.add(n);
        if(n > 1){
            if(n%2 == 0) calcularSucesionRec(lista, n/2);
            else calcularSucesionRec(lista, 3*n+1);
        }
    }
    public static List<Integer> calcularSucesion(int n){
        List<Integer> lista = new LinkedList<Integer>();
        calcularSucesionRec(lista,n);
        return lista;
    }
    public static void ImprimirLista(List<Integer> lista){
        for(int e: lista){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero = in.nextInt();
        if(numero == 1){
            System.out.println("Introduce un numero mayor a 1");
        }
        else{
            ImprimirLista(calcularSucesion(numero));
        }
        in.close();
    }
}
