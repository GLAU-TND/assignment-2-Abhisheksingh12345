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
    private TreeNode<E> root = null;
    private int size = 0;
    private int notContainLeftChild;
    private int height = 0;

    private TreeNode<E> addInFamily(E data, TreeNode<E> currentMember) {
        if (currentMember == null) {
            TreeNode newMember = new TreeNode<>();
            newMember.setData(data);
        }
        if ((Integer) data < (Integer) currentMember.getData()) {
            currentMember.setLeftChild(addInFamily(data, currentMember.getLeftChild()));
        } else {
            currentMember.setRightChild(addInFamily(data, currentMember.getRightChild()));
        }
        return currentMember;

    }

    @Override
    public boolean add(E data) {
        root = addInFamily(data, root);
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
