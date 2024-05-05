package Ejercicio11;
import Ejercicio1.GeneralTree;
public class ParcialArbolesTest {
    public static void main(String[] args){
        GeneralTree<Integer> a = new GeneralTree<Integer>(2);
        GeneralTree<Integer> b = new GeneralTree<Integer>(1);
        GeneralTree<Integer> c = new GeneralTree<Integer>(25);
        GeneralTree<Integer> d = new GeneralTree<Integer>(5);
        GeneralTree<Integer> e = new GeneralTree<Integer>(4);
        GeneralTree<Integer> f = new GeneralTree<Integer>(13);
        GeneralTree<Integer> g = new GeneralTree<Integer>(18);
        GeneralTree<Integer> h = new GeneralTree<Integer>(7);
        GeneralTree<Integer> i = new GeneralTree<Integer>(11);
        GeneralTree<Integer> j = new GeneralTree<Integer>(3);
        GeneralTree<Integer> k = new GeneralTree<Integer>(83);
        GeneralTree<Integer> l = new GeneralTree<Integer>(33);
        GeneralTree<Integer> m = new GeneralTree<Integer>(12);
        GeneralTree<Integer> n = new GeneralTree<Integer>(17);
        GeneralTree<Integer> o = new GeneralTree<Integer>(9);

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
        
        j.addChild(l);
        j.addChild(m);
        j.addChild(n);
        j.addChild(o);

        System.out.println(ParcialArboles.resolver(a) ? "Yes" : "No");
    }
}
