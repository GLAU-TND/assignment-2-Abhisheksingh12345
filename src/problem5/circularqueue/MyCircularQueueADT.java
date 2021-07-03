package problem5.circularqueue;

public interface MyCircularQueueADT<E> {
    boolean enqueue(E data);

    boolean dequeue();

    boolean search(E data);
}
