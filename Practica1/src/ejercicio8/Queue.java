package ejercicio8;
import java.util.*;
public class Queue <T> {
    private List <T> data;

    public Queue(){
        this.data = new ArrayList<>();
    }
    public void enqueue(T dato){
        this.data.add(dato);
    }
    public T dequeue(){
        T aux = this.data.get(0);
        this.data.remove(0);
        return aux;
    }
    public boolean isEmpty(){
        return (this.data.isEmpty());
    }
    public T head(){
        return (this.data.get(0));
    }
    public int size(){
        return (this.data.size());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: [");
        for (int i = 0; i < this.data.size(); i++) {
            sb.append(this.data.get(i));
            if (i < this.data.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
