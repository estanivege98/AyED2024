package Ejercicio9;
import java.util.*;
import Ejercicio1.GeneralTree;
public class ParcialArbolesTest {
    public static void main(String[] args){
        // Creo primer arbol del ejemplo
        GeneralTree<Integer> a = new GeneralTree<Integer>(12);
		GeneralTree<Integer> b = new GeneralTree<Integer>(12);
		GeneralTree<Integer> c = new GeneralTree<Integer>(25);
		GeneralTree<Integer> d = new GeneralTree<Integer>(35);
		GeneralTree<Integer> e = new GeneralTree<Integer>(18);
		GeneralTree<Integer> f = new GeneralTree<Integer>(25);
		GeneralTree<Integer> g = new GeneralTree<Integer>(35);
		GeneralTree<Integer> h = new GeneralTree<Integer>(14);
		GeneralTree<Integer> i = new GeneralTree<Integer>(12);
		GeneralTree<Integer> j = new GeneralTree<Integer>(33);
		GeneralTree<Integer> k = new GeneralTree<Integer>(35);
		GeneralTree<Integer> m = new GeneralTree<Integer>(35);
		GeneralTree<Integer> n = new GeneralTree<Integer>(83);
		GeneralTree<Integer> l = new GeneralTree<Integer>(90);
		GeneralTree<Integer> o = new GeneralTree<Integer>(33);
		
		a.addChild(b);
		a.addChild(c);
		
		b.addChild(d);
		b.addChild(e);
		
		c.addChild(f);
		
		d.addChild(g);
		
		g.addChild(k);
		
		e.addChild(h);
		e.addChild(i);
		e.addChild(j);
		
		j.addChild(m);
		j.addChild(n);
		j.addChild(l);
		j.addChild(o);
		
		//System.out.println(esDeSeleccion(a));
        System.out.println(ParcialArboles.esDeSeleccion(a) ? "Yes" : "No");
    }
}
