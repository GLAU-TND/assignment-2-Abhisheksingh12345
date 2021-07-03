/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree();
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(10);
        tree.add(11);
        tree.traverse();


    }
}
