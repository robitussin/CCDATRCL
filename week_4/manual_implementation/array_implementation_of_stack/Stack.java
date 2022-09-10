public class Stack {

    // Properties
    String arr[]; // Declare array
    int top;
    int capacity;

    // Constructor
    Stack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            System.exit(1);
        }

        System.out.println("Inserting " + data);
        arr[++top] = data;
    }

    // Remove element from stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }

        System.out.println("Removing " + arr[top]);

        return arr[top--];
    }

    // Returns the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // Returns the top element of the stack
    public String peek() {

        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }

        return arr[top];
    }

    // Displays all elements in the stack
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
