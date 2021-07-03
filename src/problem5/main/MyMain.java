/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.PersonClass;

import java.util.Scanner;

//executable class
public class MyMain {

    public static void main(String[] args) {
        functionBehaviour();
    }

    private static void functionBehaviour() {
        Scanner tell = new Scanner(System.in);
        boolean trun = false;
        MyCircularQueue<PersonClass> circularQueue = new MyCircularQueue();
        while (trun != true) {
            System.out.println("Enter the function number from Menu" +
                    "1.Add the data in record" +
                    "2.Delete data from record" +
                    "3.print record" +
                    "4.Search for record" +
                    "5.Exit");
            int choice = tell.nextInt();
            switch (choice) {
                case 1 -> circularQueue.enqueue(new NewEntry().EnterPersonData());
                case 2 -> circularQueue.dequeue();
                case 3 -> circularQueue.Traverse();
                case 5 -> trun = true;
                default -> System.out.println("sorry wrong input ");
            }
        }
    }
}
