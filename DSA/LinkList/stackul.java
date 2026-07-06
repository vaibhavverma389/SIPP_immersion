//stack using linked list
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// Stack using Linked List
public class stackul {
    private Node head;
    // Push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int popped = head.data;
        head = head.next;
        return popped;
    }
    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.data;
    }
    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }
    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        stackul stack = new stackul();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Stack: ");
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
    }
}