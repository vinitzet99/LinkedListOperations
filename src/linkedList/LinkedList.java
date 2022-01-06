/**
 * @author Vinit Kumar
 * @created on 06-01-2022
 * Linked list methods
 */
package linkedList;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * add node in the start
     * create new node
     * check if list is empty or not
     * update add node
     */
    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    /**
     * add node in the end
     * create new node
     * check if list is empty or not
     * update add node
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * print linked list
     * traverse if not null
     * print each node
     */
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    /**
     * add node in the between
     * create temp node
     * update link
     */
    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    /**
     * remove node from the start of list
     * checks if there is node in linked list
     * checks if there is one node
     * update head to next
     */
    public void remove() {
        if (head == null) {
            System.out.println("No records present");
        }
        else if(head.next== null){
            head=null;
        }
        else{
            head=head.next;
        }
    }
    /**
     * remove node from the end of list
     * checks if there is node in linked list
     * checks if there is one node
     * update head to next
     */
    public void pop() {
        if (head == null) {
            System.out.println("No records present");
        }
        else if(head.next== null){
            head=null;
        }
        else{
            Node previous=head;
            Node temp=head;
            while(temp.next!=null){
                previous=temp;
                temp=temp.next;
            }
            previous.next=null;
            tail=previous;
        }

    }
}
