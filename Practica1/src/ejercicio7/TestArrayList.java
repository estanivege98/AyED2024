package ejercicio7;

import java.util.*;
public class TestArrayList {

    public static boolean EstaEnLista(Estudiante e, ArrayList<Estudiante> lista){
        boolean encontre = false;
        for(Estudiante est : lista){
            if(est == e){
                encontre = true;
            }
        }
        return encontre;
    }
    public static void IncisoD(Scanner in){
        ArrayList<Estudiante> estuLista = new ArrayList<Estudiante>();
        Estudiante e1 = new Estudiante("Estanislao", "Vegetti Moal", "2","estanivegetti@hotmail.com", "Calle 467");
        Estudiante e2 = new Estudiante("Lautaro", "Gardinetti", "0", "lauarauca-7@hotmail.com", "Calle 65");
        Estudiante e3 = new Estudiante("Obi-Wan", "Kenobi", "??", "Obi@Wan.com", "Hoth");
        estuLista.add(e1); estuLista.add(e2); estuLista.add(e3);
        
        ArrayList<Estudiante> copiaLista = new ArrayList<Estudiante>(estuLista);
        System.out.println("Lista original");
        for (Estudiante est : estuLista){
            System.out.println(est.getApellido());
        }
        System.out.println("--------------");
        System.out.println("Lista copia");
        for (Estudiante est : copiaLista){
            System.out.println(est.getApellido());
        }

        // Modifico un dato de la lista

        Estudiante estuMod = estuLista.get(0);
        System.out.println("Introduce un nombre: ");
        estuMod.setNombre(in.next());
        System.out.println("Introduce un apellido");
        estuMod.setApellido(in.next());
        System.out.println("Imprimo lista original modificada");
        for(Estudiante est : estuLista){
            System.out.println(est.getApellido());
        }
        System.out.println("Imprimo copia");
        for(Estudiante est : copiaLista){
            System.out.println(est.getApellido());
        }
        System.out.println("--------------");
        System.out.println("Agrego un alumno a la lista");
        Estudiante e4 = new Estudiante("Tomas", "Salerno", "8", "tomisaler@gmail.com", "Calle 551");
        if(EstaEnLista(e4, estuLista)){
            System.out.println("El estudiante ya existe en la lista y no se puede añadir.");
        }
        else{
            estuLista.add(e4);
            System.out.println("El estudiante fue añadido correctamente.");
        }
    }

    public static void main(String[] args){
        /* INCISO A */
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("INCISO A");
        for (int i = 0; i< args.length; i++){
            lista.add(Integer.parseInt(args[i]));
        }
        System.out.println("Imprimiendo Lista:");
        for (int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println();
        
        /* INCISO D */
        System.out.println("INCISO D");
        IncisoD(in);

        /* INCISO F */
        
        in.close();
    }
}
