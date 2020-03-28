package problem3.myqueue;

public interface PriorityQueueADT<E> {
    // to add data
    boolean add(E data, int Priority);

    // to print data
    boolean traverse();

    // to delete from queue
    boolean delete(E data);

    // to search from queue
    boolean search(E data);
}
