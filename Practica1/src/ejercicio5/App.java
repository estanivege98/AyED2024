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
    
    public static void calculoB(IncisoB o, int[] vN){
        o.setMax(-1);
        o.setMin(9999);
        int suma = 0;
        for (int i=0; i<vN.length; i++){
            if (vN[i]<o.getMin()){
                o.setMin(vN[i]);
            }
            if (vN[i]>o.getMax()){
                o.setMax(vN[i]);
            }
            suma+=vN[i];
        }
        o.setProm(suma / vN.length);
    } 
    
    public static void main(String[] args){
        int[] vecNum = {2, 4, 6, 8};
        System.out.println(calculoA(vecNum));
        IncisoB objecto = new IncisoB();
        calculoB(objecto, vecNum);
        System.out.println(objecto.impresion());
    }
    

}
