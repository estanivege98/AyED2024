/* Se debe usar un recorrido en profundidad, ya que necesitamos obtener un camino como resultado. Este camino se debe guardar en una lista 
 * de enteros. Se necesitan dos listas: una que vamos a ir manejando (actual), y la otra que representara el maximo camino que tenemos 
 * (listaMax). Si el nodo es una hijo, se debe agregar a la lista y luego comparar la longitud con listaMax. Si la lista actual es mas grande
 * que listaMax, se debe actualizar listaMax. 
 * Si un nodo tiene dos hijos hojas, el hijos izquierdo debe eliminarse de la lista actual, y agregar su hijo derecho. 
 * Esto mismo se debe repetir cuando se va llamando a la recursion (subiendo de nivel), la lista actual se esta actualizando permanentemente
 * hasta llegar a las hojas.
 */

package Ejercicio7;

public class Caminos {

}
