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
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
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
        } else if (head.next == null) {
            head = null;
        } else {
            Node previous = head;
            Node temp = head;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
            tail = previous;
        }

    }

    /**
     * Search 30 in linked list
     * check if list is not empty
     * check if data exists
     * return position if exists else return -1 if not exists
     */
    public int search(int value) {
        int flag = 0, count = 0;
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == value) {
                    count++;
                    flag = 1;
                    break;
                }
                temp = temp.next;
                count++;
            }
            if (flag == 1) {
                return count;
            } else {
                System.out.println("Not found!!");
                return -1;
            }
        }
        return -1;
    }

    /**
     * Insert 40 after 30
     * check if list is not empty
     * traverse for 30
     * update link
     */
    public void insertNode(int value) {
        int toFound = 30;
        Node newNode = new Node(value);
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == toFound) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * Delete node with given value
     * check if list is not empty
     * traverse for value and track previous
     * update previous with next node to value node
     */
    public void deleteNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node previous = head;
            Node temp = head;
            while (temp != null) {
                if (temp.data == value) {
                    newNode.next = temp.next;
                    previous.next = temp.next;
                    break;
                }
                previous = temp;
                temp = temp.next;
            }
        }
    }

    /**
     * Finds size of list
     * traverse through the list
     * increase count
     * return count
     */
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
