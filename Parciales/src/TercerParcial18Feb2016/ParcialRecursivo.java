package TercerParcial18Feb2016;
import java.util.*;
import GeneralTree.GeneralTree;

public class ParcialRecursivo {
    public List<String> devolverCamino(GeneralTree<Letranumero> arbol){
        List<String> camino = new LinkedList<>();
        if(arbol.isEmpty()){
            return camino;
        }
        else{
            devolverCaminoHelper(arbol, camino);
            return camino;
        }
    }
    private boolean devolverCaminoHelper(GeneralTree<Letranumero> arbol, List<String> camino){
        camino.add(arbol.getData().getLetra());
        int pos = arbol.getData().getNumero();
        if(arbol.isLeaf()){
            return true;
        }
        List<GeneralTree<Letranumero>> tree_aux = arbol.getChildren();
        if (pos > 0 && pos <= tree_aux.size()) {
            return devolverCaminoHelper(tree_aux.get(pos - 1), camino);
        }
        else{
            return false;
        }
        //return false;
    }

}
