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
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentMember.getData()) {
            currentMember.setLeftChild(addInFamily(data, currentMember.getLeftChild()));
        } else
            currentMember.setRightChild(addInFamily(data, currentMember.getRightChild()));
        return currentMember;
    }

//    public int parentNoContainLeftChild() {
//
//    }


    @Override
    public boolean add(E data) {
        root = addInFamily(data, root);
        size++;
        return true;
    }

    /**
     * this is a recursive function deleteFromFamily.
     * here the data is 1'st find out of family and then called findSmallest member form family (Tree) and then it swapped the order in family .
     *
     * @param data --> generic type data .
     * @return --> return result if there are 0 member in family then it return null otherwise return hole concluded tree.
     */
    private TreeNode<E> deleteFromFamily(E data, TreeNode<E> currentMember) {
        if (currentMember == null) {
            System.out.println("there are 0 family member ");
            return null;
        }
        if (data.equals(currentMember.getData())) {
            //case 1 : no children of the node to be delete
            if (currentMember.getLeftChild() == null && currentMember.getRightChild() == null) {
                return null;
            }
            // case 2 : only one child of the node to be deleted
            if (currentMember.getRightChild() == null) {
                return currentMember.getLeftChild();
            }
            if (currentMember.getLeftChild() == null) {
                return currentMember.getRightChild();
            }
            // case 3 : two children of the node to be deleted
            E smallestValue = findSmallest(currentMember.getRightChild());
            currentMember.setData(smallestValue);
            currentMember.setRightChild(deleteFromFamily(smallestValue, currentMember.getRightChild()));
            return currentMember;
        }
        if ((Integer) currentMember.getData() < (Integer) data) {
            deleteFromFamily(data, currentMember.getRightChild());
        } else {
            currentMember.setRightChild(deleteFromFamily(data, currentMember.getRightChild()));
        }
        return currentMember;
    }

    /**
     * this function will found out the last children of the family from its forefather or can says its parents-parents
     * there the tertiary condition which continuously check for last member until the condition is true.
     *
     * @param findPOutMember --> make out the last member of the family in leftChildren direction.
     * @return --> return the last member of the family.
     */
    private E findSmallest(TreeNode<E> findPOutMember) {
        return (findPOutMember.getLeftChild() == null) ? findPOutMember.getData() : findSmallest(findPOutMember.getLeftChild());
    }

    @Override
    public boolean remove(E data) {
        root = deleteFromFamily(data, root);
        size--;
        return true;
    }

    @Override
    public boolean insert(E data) {
        return false;
    }

    @Override
    public boolean search() {
        return false;
    }

    /**
     * this function check the member from the root member in @param fromTop
     * program behaviour have if - condition statement and call the leftChild function.
     *
     * @param fromTop --> store the root member.
     */
    private void printOnlyLeftChildren(TreeNode<E> fromTop) {
        if (fromTop == null) System.out.println("there are 0 member in the family");
        else leftChild(fromTop);
    }

    /**
     * this is a recursive function which continuously print the childSide-family of tree.
     *
     * @param leftSide --> stored root member.
     */
    private void leftChild(TreeNode<E> leftSide) {
        if (leftSide.getData() == null) {
            System.out.println("these are the left-family member");
        }
        System.out.println(leftSide.getData());
        leftChild(leftSide.getLeftChild());
    }

    @Override
    public boolean traverse() {
        printOnlyLeftChildren(root);
        return true;
    }

    public void traversePostOrder(TreeNode<E> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftChild());
            traversePostOrder(currentNode.getRightChild());
            visit(currentNode.getData());
        }
    }

    public void traversePerOrder(TreeNode<E> currentNode) {
        if (currentNode == null) {
            visit(currentNode.getData());
            traversePerOrder(currentNode.getLeftChild());
            traversePerOrder(currentNode.getRightChild());
        }
    }

    private void visit(E data) {
        System.out.println(" " + data);
    }
}
