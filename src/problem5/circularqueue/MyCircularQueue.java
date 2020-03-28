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

    public int getSize() {
        return size;
    }

    public Node<E> createCircularNode(E data) {
        return new Node<>(data);
    }

    private void addFromFront(E data, int size) {
        if (size <= this.size) {
            if (size == 0) {
                front = createCircularNode(data);
                rear = front;
            } else {
                rear.setNext(createCircularNode(data));
                rear = rear.getNext();
            }
        } else {
            System.out.println("Sorry can't store data queue underflow please delete some data");
        }
    }

    @Override
    public boolean enqueue(E data) {
        addFromFront(data, size);
        return true;
    }

    private void deleteFromQueue() {
        front = front.getNext();
        size--;
    }

    @Override
    public boolean dequeue() {
        deleteFromQueue();
        return false;
    }

    @Override
    public boolean search(E data) {
        return false;
    }
}
