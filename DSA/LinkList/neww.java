class Node {
    int data;
    Node next; 
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkList {
    Node head;
    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    // insert Head
    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // dellete head
    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;
    }
    // dlete teail
    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // insert tail
    public void insertTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    // element exit return postion
    public int search(int data) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1; // Element not found
    }
   // delete target element
    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found in the Linked List");
            return;
        }

        current.next = current.next.next;
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current
            current = next;      // Move to next node
        }

        head = prev; // Update head to the new first node
    }
}


public class neww {
    public static void main(String[] args) {

        LinkList ll = new LinkList();

        //list 2 3 5 6 2 1 8 3 2 5 6 
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(6);
        ll.add(2);
        ll.add(1);
        ll.add(8);
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(6);
        ll.display();
        ll.reverse();
        ll.display();

    }
}
