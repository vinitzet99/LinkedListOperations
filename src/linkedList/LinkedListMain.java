/**
 * @author Vinit Kumar
 * @created on 06-01-2022
 * User interface menu
 */
package linkedList;

import java.util.Scanner;

public class LinkedListMain {
    /**
     * Displays menu
     * creates menu and performs operation based on
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Data structure problem using Java Generics");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 to add the data in the middle");
        System.out.println("Enter 4 to del the data at the start");
        switch (sc.nextInt()) {
            case 1:
                new Operations().addDataAtStart(); // add data at start of list
                break;
            case 2:
                new Operations().addDataAtEnd(); // add data at end of list
                break;
            case 3:
                new Operations().addDataInBetween(); // add data in between two elements of list
                break;
            case 4:
                new Operations().delDataAtStart(); // del data at start of list
                break;
        }
    }
}
