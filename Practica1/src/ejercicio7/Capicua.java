package ejercicio7;

import java.util.ArrayList;

public class Capicua{
    public static boolean esCapicuaA(ArrayList<Integer> lista) {
        boolean ok = true;
        if(!lista.isEmpty()){
            int pri = 0;
            int ult = lista.size() -1;
            while((pri<ult)&& ok ){
                if(lista.get(pri).equals(lista.get(ult))){
                    pri++;
                    ult--;
                }
                else ok = false;
            } 
        }
        return ok;
    }
    private static boolean comprobar(ArrayList<Integer> lista, Integer pri, Integer ult){
        boolean ok = true;
        if(pri < ult){
            if(lista.get(pri).equals(lista.get(ult))) ok = comprobar(lista, ++pri, --ult);
        }
        else ok = false;
        return ok;
    }
    public static boolean esCapicuaRec(ArrayList<Integer> lista){
        if(!lista.isEmpty() && lista.size() > 1){
            return comprobar(lista, 0, lista.size()-1);
        }
        else return false;
    }

    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(2);
        lista.add(4);
        lista.add(4);
        lista.add(2);

        if(esCapicuaA(lista)){
            System.out.println("Es Capicua (Metodo A)");
        }
        if(esCapicuaRec(lista)){
            System.out.println("Es Capicua (Metodo B)");
        }
        
    }
}
