package Ejercicio4;

public class AreaEmpresa {
    private String identificacion;
    private int tardanza;

    public AreaEmpresa(String id, int tar){
        this.identificacion = id;
        this.tardanza = tar;
    }

    public String getIdentificacion(){
        return identificacion;
    }
    public int getTardanza(){
        return tardanza;
    }
}
