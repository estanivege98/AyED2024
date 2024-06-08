package TercerParcial18Feb2016;

public class Letranumero {
    private String letra;
    private int numero;

    public Letranumero(String letra, int numero){
        this.letra = letra;
        this.numero = numero;
    }

    public String getLetra(){
        return letra;
    }
    public int getNumero(){
        return numero;
    }

    public void setLetra(String letra){
        this.letra = letra;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}
