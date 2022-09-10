// Linked list implementation of Stack
public class App {
    public static void main(String[] args) {

        // Create new Stack Object
        Stack tshirt_stack = new Stack();

        // Insert new elements into the stack
        tshirt_stack.push("Blue Shirt");
        tshirt_stack.push("Red Shirt");
        tshirt_stack.push("Yellow Shirt");
        tshirt_stack.push("Green Shirt");

        // Show the size of the stack
        System.out.println("The size of the stack is: " + tshirt_stack.size());

        // Show top element in the stack
        System.out.println("The top of the stack is: " + tshirt_stack.peek());

        // Remove top element in the stack
        tshirt_stack.pop();

        // Show all elements in Stack
        tshirt_stack.printStack();

        // Show top element in the stack
        System.out.println("The top of the stack is: " + tshirt_stack.peek());
    }
}