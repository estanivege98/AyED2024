package ejercicio8;

public class TestQueue {
    public static void main(String[] args) {
        // Probando la clase Queue
        System.out.println("Probando la clase Queue:");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue);
        System.out.println("Tamaño de la cola: " + queue.size());
        System.out.println("¿La cola está vacía? " + queue.isEmpty());
        System.out.println("Elemento en la cabeza de la cola: " + queue.head());
        System.out.println("Elemento retirado de la cola: " + queue.dequeue());
        System.out.println("Queue después de retirar un elemento: " + queue);

        // Probando la clase DoubleEndedQueue
        System.out.println("\nProbando la clase DoubleEndedQueue:");
        DoubleEndedQueue<String> doubleEndedQueue = new DoubleEndedQueue<>();
        doubleEndedQueue.enqueue("A");
        doubleEndedQueue.enqueue("B");
        doubleEndedQueue.enqueue("C");
        System.out.println("DoubleEndedQueue: " + doubleEndedQueue);
        doubleEndedQueue.enqueueFirst("Z");
        System.out.println("DoubleEndedQueue después de agregar al principio: " + doubleEndedQueue);

        // Probando la clase CircularQueue
        System.out.println("\nProbando la clase CircularQueue:");
        CircularQueue<Character> circularQueue = new CircularQueue<>();
        circularQueue.enqueue('X');
        circularQueue.enqueue('Y');
        circularQueue.enqueue('Z');
        System.out.println("CircularQueue: " + circularQueue);
        System.out.println("Elemento rotado: " + circularQueue.shift());
        System.out.println("CircularQueue después de rotar: " + circularQueue);
    }
}
