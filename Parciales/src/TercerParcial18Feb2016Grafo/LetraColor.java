package TercerParcial18Feb2016Grafo;

public class LetraColor {
    private String letra;
    private String color;

    public LetraColor(String letra, String color){
        this.letra = letra;
        this.color = color;
    }

    public String getLetra(){
        return letra;
    }
    public String getColor(){
        return color;
    }

    public void setLetra(String letra){
        this.letra = letra;
    }
    public void setColor(String color){
        this.color = color;
    }
}
