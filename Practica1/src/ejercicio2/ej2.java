package ejercicio2;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = in.nextInt();
        int [] multiplos = new int[num]; // Creo el arreglo con la cantidad que introduje
        multiplos = calcularMultiplos(num); // Llamo a 'calcularMultiplos', que me devuelve el arreglo con los multiplos del numero que introduje
        for(int i = 0; i<num; i++){
            System.out.println((i+1)+ ")"+ multiplos[i]);
        }

        in.close();
    }

    public static int[] calcularMultiplos(int num){
        int[] vecMultiplos = new int[num]; // Creo un arreglo interno para poder hacer el calculo de los multiples
        for(int i=0; i<num; i++){
            vecMultiplos[i] = num * (i+1); // Calculo los multiplos y los agrego en las posiciones del arreglo
        }
        return vecMultiplos; // Devuelvo el vector con los multiplos
    }
}
