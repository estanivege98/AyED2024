package ejercicio5;
import java.util.*;

public class App {
    
    public static String calculoA(int[] vecNum){
        int max = -1, min = 999999, prom, suma = 0;
        for(int i = 0; i<4; i++){
            if(vecNum[i]> max){
                max = vecNum[i];
            }
            if(vecNum[i]< min){
                min = vecNum[i];
            }
            suma+=vecNum[i];
        }
        prom = suma / 4;
        return ("Minimo: " + min + " Maximo: " + max +" Promedio: " + prom);
    }
    
    public static String calculoB(List<Integer> lN){
        int max = -1, min = 999999, prom, suma = 0;
        for(int numero : lN){
            if (numero > max){
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
            suma += numero;
        }
        prom = suma / 4;
        return ("Minimo: " + min + " Maximo: " + max +" Promedio: " + prom);
    } 
    
    public static void main(String[] args){
        int[] vecNum = {2, 4, 6, 8};
        System.out.println(calculoA(vecNum));
        List<Integer> listaNum = new ArrayList<Integer>();
        listaNum.add(2);
        listaNum.add(4);
        listaNum.add(6);
        listaNum.add(8);
        System.out.println(calculoB(listaNum));
    }
    

}
