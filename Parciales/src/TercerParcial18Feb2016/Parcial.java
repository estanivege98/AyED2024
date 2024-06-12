package TercerParcial18Feb2016;
import GeneralTree.GeneralTree;
import java.util.*;

public class Parcial {

    // Método que devuelve un camino en un árbol general
    public List<String> devolverCaminoIterativo(GeneralTree<Letranumero> arbol){
        // Crear una lista para almacenar el camino
        List<String> camino = new LinkedList<>();
        // Crear una lista para almacenar los hijos del nodo actual
        List<GeneralTree<Letranumero>> listaArbol = new LinkedList<GeneralTree<Letranumero>>();
        // Verificar si el árbol está vacío
        if (!arbol.isEmpty()) {
            // Crear una variable auxiliar para recorrer el árbol
            GeneralTree<Letranumero> tree_aux = arbol;
            // Crear una variable para almacenar la posición del nodo actual en la lista de hijos
            int pos;
            // Crear una variable booleana para controlar el bucle
            boolean ok = true;
            // Verificar si el nodo actual es una hoja
            if (tree_aux.isLeaf()) {
                ok = false;
            }
            // Mientras el nodo actual no sea una hoja
            while (ok) {
                // Añadir el dato del nodo actual al camino
                camino.add(tree_aux.getData().getLetra());
                // Limpiar la lista de hijos
                listaArbol.clear();
                // Añadir todos los hijos del nodo actual a la lista de hijos
                listaArbol.addAll(tree_aux.getChildren());
                // Obtener la posición del nodo actual en la lista de hijos
                pos = tree_aux.getData().getNumero();
                // Si la posición es válida
                if (pos > 0 && pos <= listaArbol.size()) {
                    // Moverse al hijo correspondiente en la lista de hijos
                    tree_aux = listaArbol.get(pos - 1);
                } else {
                    // Si la posición no es válida, terminar el bucle
                    ok = false;
                }
            }
        }
        // Devolver el camino
        return camino;
    }
}