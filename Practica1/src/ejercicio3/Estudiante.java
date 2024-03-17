package ejercicio3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String comision;
    private String mail;
    private String direccion;

    public Estudiante(String nombre, String apellido, String comision, String mail, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.comision=comision;
        this.mail=mail;
        this.direccion=direccion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getComision(){
        return comision;
    }
    public String getMail(){
        return mail;
    }
    public String getDireccion(){
        return direccion;
    }

    public String tusDatos(){
        return ("Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " E-Mail: " + this.getMail() + " direccion: " + this.getDireccion() + " Comision: " + this.getComision());
    }
}
