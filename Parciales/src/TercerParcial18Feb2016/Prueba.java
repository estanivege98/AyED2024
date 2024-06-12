package TercerParcial18Feb2016;
import java.util.*;
import GeneralTree.GeneralTree;

public class Prueba {
    public static void main(String[] args) {

        Letranumero letra = new Letranumero("E", 3);
        List<GeneralTree<Letranumero>> children1 = new LinkedList<GeneralTree<Letranumero>>();
        Letranumero letra2 = new Letranumero("A", 7);
        Letranumero letra3 = new Letranumero("B", 9);
        Letranumero letra4 = new Letranumero("C", 6);
        children1.add(new GeneralTree<>(letra2));
        children1.add(new GeneralTree<>(letra3));
        children1.add(new GeneralTree<>(letra4));
        GeneralTree<Letranumero> ab1 = new GeneralTree<Letranumero>(letra, children1);


        Letranumero letra5 = new Letranumero("F", 2);
        List<GeneralTree<Letranumero>> children2 = new LinkedList<GeneralTree<Letranumero>>();
        Letranumero letra6 = new Letranumero("D", 10);
        children2.add(new GeneralTree<Letranumero>(letra6));
        GeneralTree<Letranumero> ab2 = new GeneralTree<Letranumero>(letra5, children2);

        Letranumero letra7 = new Letranumero("J", 4);
        List<GeneralTree<Letranumero>> children3 = new LinkedList<GeneralTree<Letranumero>>();
        Letranumero letra8 = new Letranumero("H", 5);
        Letranumero letra9 = new Letranumero("I", 10);
        children3.add(new GeneralTree<Letranumero>(letra8));
        children3.add(new GeneralTree<Letranumero>(letra9));
        GeneralTree<Letranumero> ab3 = new GeneralTree<Letranumero>(letra7, children3);

        Letranumero letra10 = new Letranumero("G", 1);
        List<GeneralTree<Letranumero>> children4 = new LinkedList<GeneralTree<Letranumero>>();
        children4.add(ab1);
        children4.add(ab2);
        children4.add(ab3);
        GeneralTree<Letranumero> a1 = new GeneralTree<Letranumero>(letra10, children4);

        ParcialRecursivo par = new ParcialRecursivo();

        List<String> lista = par.devolverCamino(a1);
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
