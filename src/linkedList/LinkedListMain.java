/**
 * @author Vinit Kumar
 * @created on 06-01-2022
 * User interface menu for Linked list operations
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
        System.out.println("Enter 5 to del the data at the end");
        System.out.println("Enter 6 to search node with value");
        System.out.println("Enter 7 to add new node after a given node ");
        System.out.println("Enter 8 to del new node after a given node ");
        System.out.println("Enter 9 to sort");
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
            case 5:
                new Operations().delDataAtEnd(); // del data at end of list
                break;
            case 6:
                new Operations().searchNode(); // search node with value
                break;
            case 7:
                new Operations().insertNode(); // insert node after a given node
                break;
            case 8:
                new Operations().deleteNode(); // del node with given value
            case 9:
                new Operations().sortList(); // sort link list
        }
    }
}
