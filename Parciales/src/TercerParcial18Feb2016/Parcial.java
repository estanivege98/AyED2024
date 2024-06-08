package TercerParcial18Feb2016;
import Ejercicio1.GeneralTree;
import java.util.*;
import Cola.Queue;
public class Parcial {

    public List<String> devolverCamino(GeneralTree<Letranumero> arbol){
        List<String> camino = new LinkedList<>();
        if (!arbol.isEmpty()) {
            GeneralTree<Letranumero> tree_aux;
            Queue<GeneralTree<Letranumero>> queue = new Queue<GeneralTree<Letranumero>>();
            queue.enqueue(arbol);
            queue.enqueue(null);
            int cont = 0;
            int numRaiz = arbol.getData().getNumero();
            boolean ok = false; // controla el flujo del while
            boolean ok2 = false; // controla el flujo del if
            cont = numRaiz -1;
            while (!queue.isEmpty() && (!ok)){
                cont++;
                tree_aux = queue.dequeue();
                if((tree_aux != null)) {
                    if((cont == numRaiz) && (!ok2)){
                        camino.add(tree_aux.getData().getLetra());
                        numRaiz = tree_aux.getData().getNumero();
                        if (tree_aux.isLeaf()){
                            ok = true;
                        }
                        ok2 = true;
                    }
                    List<GeneralTree<Letranumero>> children = tree_aux.getChildren();
                    for (GeneralTree<Letranumero> child: children) {
                        queue.enqueue(child);
                    }
                }
                else {
                    cont = 0;
                    ok2 = false;

                    if(!queue.isEmpty()) {
                        queue.enqueue(null);
                    }
                }
            }
        return camino;
        }


        return camino;
    }
}