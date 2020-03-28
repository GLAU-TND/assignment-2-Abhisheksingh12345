/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements BinarySearchTree<E> {
    private TreeNode<E> root;
    private int size = 0;
    private int notContainLeftChild;
    private int height = 0;


    @Override
    public boolean add(E data) {

    }

    @Override
    public boolean remove(E data) {
        return false;
    }

    @Override
    public boolean insert(E data) {
        return false;
    }

    @Override
    public boolean search() {
        return false;
    }
}
