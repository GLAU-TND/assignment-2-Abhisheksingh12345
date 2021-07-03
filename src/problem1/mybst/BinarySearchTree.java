package problem1.mybst;

public interface BinarySearchTree<E> {
    boolean add(E data);

    boolean remove(E data);

    boolean insert(E data);

    boolean search();

    boolean traverse();
}
