package ejercicio1;
import java.util.Scanner;

public class ej1 {

    public static void printFor(int a, int b){
        //int i = b;
        for (int i = a; i <= b; i++){
            System.out.println(a);
            a++;
        }
    }
    public static void printWhile(int a, int b){
        while (a <= b){
            System.out.println(a);
            a++;
        }
    }
    public static void printNoStructure(int a, int b){
        if (a <= b){
            System.out.println(a);
            printNoStructure(a+1, b);
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca un numero de inicio: ");
        int a = in.nextInt();
        System.out.println("Ahora de fin: ");
        int b = in.nextInt();
        System.out.println("Impresion con 'For':");
        printFor(a, b);
        System.out.println("Impresion con 'While':");
        printWhile(a, b);
        System.out.println("Impresion sin iterativas:");
        printNoStructure(a, b);
        
        in.close();
    }
}
