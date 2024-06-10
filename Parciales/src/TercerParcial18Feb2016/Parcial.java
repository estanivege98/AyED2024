package TercerParcial18Feb2016;
import GeneralTree.GeneralTree;
import java.util.*;
import Cola.Queue;
public class Parcial {

    public List<String> devolverCaminoIterativo(GeneralTree<Letranumero> arbol){
        List<String> camino = new LinkedList<>();
        if (!arbol.isEmpty()) {
            int cont = 0;
            List<Letranumero> lista = new ArrayList<Letranumero>();
            boolean ok = true;
            while (ok) {
                if (arbol.isLeaf())
                    ok = false;
                camino.add(arbol.getData().getLetra());
                cont = arbol.getData().getNumero();
                lista.Clear();
                lista.addAll(arbol.getChildren());
                arbol = lista.get(cont);
            }
        return camino;
    }
}