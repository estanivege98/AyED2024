package ejercicio5;

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
    
    
    public static void main(String[] args){
        int[] vecNum = {2, 4, 6, 8};
        System.out.println(calculoA(vecNum));

    }
}
