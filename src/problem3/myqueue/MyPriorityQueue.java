/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue<E> implements PriorityQueueADT<E> {\
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    @Override
    public boolean add(E data) {
        return false;
    }

    @Override
    public boolean traverse() {
        return false;
    }

    @Override
    public boolean delete(E data) {
        return false;
    }

    @Override
    public boolean search(E data) {
        return false;
    }
}
