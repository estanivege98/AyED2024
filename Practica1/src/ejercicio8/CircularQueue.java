package ejercicio8;

public class CircularQueue<T> extends Queue<T>{
    
    public CircularQueue(){
        super();
    }

    public T shift(){
        if (!isEmpty()){
            T elementoRotado = dequeue();
            enqueue(elementoRotado);
            return elementoRotado;
        }
        else {
            throw new IllegalStateException("La cola esta vacia");
        }
    }
}
