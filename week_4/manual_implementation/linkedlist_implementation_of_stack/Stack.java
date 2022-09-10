public class Stack {

    class Node {
        String data; // integer data
        Node next; // pointer to the next node
    }

    // Properties
    static Node top;
    static int nodeCount;

    public Stack() {
        top = null;
        nodeCount = 0;
    }

    // Adds an element to the stack
    public void push(String data) {
        Node node = new Node();

        System.out.println("Inserting " + data);

        node.data = data;
        node.next = top;

        // update top pointer
        top = node;

        // increase stack's size by 1
        this.nodeCount += 1;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Returns the top element of the stack
    public String peek() {
        // check for an empty stack
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }

    // Removes the top element from the stack
    public String pop() // remove at the beginning
    {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }

        // take note of the top node's data
        String top = peek();

        System.out.println("Removing " + top);

        // decrease stack's size by 1
        this.nodeCount -= 1;

        // update the top pointer to point to the next node
        this.top = (this.top).next;

        return top;
    }

    // Returns the size of the stack
    public int size() {
        return this.nodeCount;
    }

    // Displays all elements in the stack
    public void printStack() {

        Node current = Stack.top;

        int count = Stack.nodeCount;
        while (count > 0) {
            System.out.println(current.data);
            current = current.next;
            count--;
        }
    }
}