/**
 * @author Vinit Kumar
 * @created on 06-01-2022
 * Linked list operations
 */
package linkedList;

public class Operations {
    /**
     * call push method to add data
     * call print method
     */
    public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }

    /**
     * call append method to add data
     * call print method
     */
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(70);
        linkedList.append(30);
        linkedList.append(56);
        linkedList.print();
    }

    /**
     * call push method to add data
     * call print method
     * call insert method to add data
     * call print method
     */
    public static void addDataInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("\nAfter:");
        linkedList.print();
    }

    /**
     * Delete 1st node in linked list
     * create list with push method
     * prints linked list
     * call remove method
     * print linked list
     */
    public static void delDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.remove();
        System.out.println("\nAfter:");
        linkedList.print();
    }

    /**
     * Delete last node in linked list
     * create list with push method
     * prints linked list
     * call pop method
     * print linked list
     */
    public static void delDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.pop();
        System.out.println("\nAfter:");
        linkedList.print();
    }

    /**
     * Search node with 30 value in linked list
     * create list with push method
     * prints linked list
     * call search method
     * print position list or message
     */
    public static void searchNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        System.out.println("\nPosition of 30 is: " + linkedList.search(30));
    }

    /**
     * insert node after a given node
     * create list with push method
     * print list
     * call insertNode method
     * print list
     */
    public static void insertNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertNode(40);
        System.out.println("\nAfter:");
        linkedList.print();
    }

    /**
     * insert node after a given node
     * create list with push method
     * print list
     * call deleteNode method
     * print list
     * print size of list
     */
    public static void deleteNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.deleteNode(40);
        System.out.println("\nAfter:");
        linkedList.print();
        System.out.println("\nSize of list: " + linkedList.size());
    }
    /**
     * insert node after a given node
     * create list with push method
     * print list
     * call sort method
     * print list
     */
    public static void sortList(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.sort();
        System.out.println("\nAfter:");
        linkedList.print();
    }
}
