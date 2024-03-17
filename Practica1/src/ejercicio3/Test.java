package ejercicio3;

public class Test {
    public static void main(String[] args){
        Estudiante[] vecEstu = new Estudiante[2];
        Profesor[] vecProf = new Profesor[3];

        // Defino Alumnos y Profesores

        vecEstu[0] = new Estudiante("Estanislao", "Vegetti Moal", "2","estanivegetti@hotmail.com", "Calle 467");
        vecEstu[1] = new Estudiante("Lautaro", "Gardinetti", "0", "lauarauca-7@hotmail.com", "Calle 65");
        vecProf[0] = new Profesor("John", "Salchichon", "jonnysalchicha@gmail.com", "2b", "Porno");
        vecProf[1] = new Profesor("Debora", "Meltroso", "deborameltroso@yahoo.com", "666", "Periodismo");
        vecProf[2] = new Profesor("Tutan", "Komilon", "tutan-komilon@hotmail.com", "13", "Historia");

        // Los imprimo

        for(int i=0; i<2; i++){
            System.out.println(vecEstu[i].tusDatos());
        }
        for(int i=0; i<3; i++){
            System.out.println(vecProf[i].tusDatos());
        }

    }
}
