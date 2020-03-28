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

    private void addInQueue(E data, int placeHolder) {
        if (front == null) {
            /**
             * node=new Node<>(null,data);
             * front=node;
             * rear=node;
             */
            front = new Node<>(data, placeHolder);
            rear = front;
        } else {
            checkPriority(data, placeHolder, front);
        }
    }

    /**
     * this is recursive function
     * In this function the new node is created by the same name again-again but with different functionalists
     *
     * @param data        --> generic type data store the generic data.
     * @param placeHolder --> Integer value which define the priority of the data
     * @param response    -->takeover the reference of the front node then changed according to the condition.
     */
    private void checkPriority(E data, int placeHolder, Node<E> response) {
        if (response.getPriorityOfData() < placeHolder) {
            if (response.getNext() == null) {
                Node<E> newOne = new Node<>(data, placeHolder);
                response.setNext(newOne);
                rear = newOne;
            } else if (response.getNext().getPriorityOfData() > placeHolder) {
                Node<E> newOne = new Node<E>(data, placeHolder);
                newOne.setNext(response.getNext());
                newOne.setPrevious(response);
            } else {
                checkPriority(data, placeHolder, response.getNext());
            }
        } else {
            if (response.getPrevious() == null) {
                Node<E> newOne = new Node<>(data, placeHolder);
                response.setNext(newOne);
                front = newOne;
            } else if (response.getPrevious().getPriorityOfData() < placeHolder) {
                Node<E> newOne = new Node<E>(data, placeHolder);
                newOne.setNext(response);
                newOne.setPrevious(response.getNext());
            } else {
                checkPriority(data, placeHolder, response.getPrevious());
            }
        }

    }

    @Override
    public boolean add(E data, int priority) {
        addInQueue(data, priority);
        return true;
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
