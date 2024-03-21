package ejercicio5;

public class IncisoB {
    private int max;
    private int min;
    private double prom;


    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    public double getProm(){
        return prom;
    }

    public void setMax(int max){
        this.max=max;
    }
    public void setMin(int min){
        this.min=min;
    }
    public void setProm(double prom){
        this.prom=prom;
    }

    public String impresion(){
        return ("Maximo: "+getMax()+" Minimo: "+getMin()+" Promedio "+getProm());
    }
}
