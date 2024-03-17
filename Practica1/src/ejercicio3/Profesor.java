package ejercicio3;

public class Profesor {
    private String nombre;
    private String apellido;
    private String mail;
    private String catedra;
    private String facultad;

    public Profesor(String nombre, String apellido, String mail, String catedra, String facultad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.mail=mail;
        this.catedra=catedra;
        this.facultad=facultad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getMail(){
        return mail;
    }
    public String getCatedra(){
        return catedra;
    }
    public String getFacultad(){
        return facultad;
    }

    public String tusDatos(){
        return ("Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " E-Mail: " + this.getMail() + " Facultad: " + this.getFacultad() + " Catedra: " + this.getCatedra());
    }
}
