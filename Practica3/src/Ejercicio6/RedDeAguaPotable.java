/* Ejercicio 6
Sea una red de agua potable, la cual comienza en un caño maestro y la misma se va dividiendo
sucesivamente hasta llegar a cada una de las casas.
Por el caño maestro ingresan “x” cantidad de litros y en la medida que el caño se divide, de acuerdo
con las bifurcaciones que pueda tener, el caudal se divide en partes iguales en cada una de ellas. Es
decir, si un caño maestro recibe 1000 litros y tiene por ejemplo 4 bifurcaciones se divide en 4 partes
iguales, donde cada división tendrá un caudal de 250 litros.
Luego, si una de esas divisiones se vuelve a dividir, por ej. en 5 partes, cada una tendrá un caudal de
50 litros y así sucesivamente hasta llegar a un lugar sin bifurcaciones.
Se debe implementar una clase RedDeAguaPotable que contenga el método con la siguiente firma:
public double minimoCaudal(double caudal)
que calcule el caudal de cada nodo y determine cuál es el caudal mínimo que recibe una casa. Asuma
que la estructura de caños de la red está representada por una variable de instancia de la clase
RedAguaPotable y que es un GeneralTree<Character>.
Extendiendo el ejemplo en el siguiente gráfico, al llamar al método minimoCaudal con un valor de
1000.0 debería retornar 25.0 */


/* Se debe usar un recorrido en profundidad. Cada nodo debe saber cuanta cantidad de hijos tiene, y deberiamos poder dividir el caudal entre
 * los hijos, es decir que el padre debe informar cuanto caudal tienen sus hijos. Este es el metodo recursivo.
 * El caso base, hay que consultar el minimo caudal. La variable minimo no puede ser pasada por parametro porque al ser un primitivo, se
 * pasa por valor y se pierde. Por lo tanto debe ir retornando el valor minimo.
 * Para lograr esto, se usa un return (y probablemente, se necesite un helper).
 * Otra solucion seria crear una clase aparte.
 */

package Ejercicio6;
import java.util.*;
import Ejercicio1.GeneralTree;

public class RedDeAguaPotable {

    private GeneralTree<Character> ab;
    public RedDeAguaPotable(GeneralTree<Character> ab){
        this.ab = ab;
    }

    public double minimoCaudal(double caudal){
        return ((!ab.isEmpty()) ? minimoCaudalHelper(ab, caudal) : -1);
    }
    private double minimoCaudalHelper(GeneralTree<Character> ab, double caudal){
        if(ab.isLeaf()){
            return caudal;
        }
        double cantPorCaudal = caudal / ab.getChildren().size();
        double caudalMin = Double.MAX_VALUE;
        List<GeneralTree<Character>> children = ab.getChildren();
        for(GeneralTree<Character> child : children){
            double caudalHijo = minimoCaudalHelper(child, cantPorCaudal);
            caudalMin = Double.min(caudalMin,caudalHijo);
        }
        return caudalMin;
    }
}
