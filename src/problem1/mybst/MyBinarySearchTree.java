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

    /**
     * In this adding new Node to the addInFamily function behaves like recursive function
     * here every node is get store in currentMember parameter and then checked by if condition.
     * condition are checked by comparision operator's and since data is of generic type then 1'st the data is
     * data is typecast in integer for simplicity.
     *
     * @param data          --> store the in generic data.
     * @param currentMember --> store the new data enter by user.
     * @return current node after simplifing.
     */
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

    public int parentNoContainLeftChild() {

    }

    @Override
    public boolean add(E data) {
        root = addInFamily(data, root);
        return true;
    }

    private void deletFromFamily(E data, TreeNode<E> currentMember) {

    }

    @Override
    public boolean remove(E data) {
        deletFromFamily(data, root);
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

    @Override
    public boolean traverse() {
        e;
    }
}
