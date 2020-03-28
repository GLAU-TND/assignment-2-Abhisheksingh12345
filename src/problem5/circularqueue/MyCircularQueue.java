/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.*;

//to implement circular queue
public class MyCircularQueue<E> implements MyCircularQueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    public void giveQueueSize(int size) {
        this.size = size;
    }

    @Override
    public boolean enqueue(E data) {
        addFromFront(data, size);

    }

    @Override
    public boolean dequeue() {
        return false;
    }

    @Override
    public boolean search(E data) {
        return false;
    }
}
