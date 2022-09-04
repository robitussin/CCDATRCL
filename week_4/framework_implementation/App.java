import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<String> tshirt_stack = new Stack<>();

        // arranging t-shirts in a stack
        tshirt_stack.push("Blue shirt");
        tshirt_stack.push("Red shirt");
        tshirt_stack.push("Yellow shirt");
        tshirt_stack.push("Green shirt");

        // Show the size of the stack
        System.out.println("The size of the stack is: " + tshirt_stack.size());

        // Show top element in the stack
        System.out.println("The top of the stack is: " + tshirt_stack.peek());

        // Remove top element in the stack
        tshirt_stack.pop();

        // Show all elements in Stack
        System.out.println("T-shirts in Stack: " + tshirt_stack);

        // Show top element in the stack
        System.out.println("The top of the stack is: " + tshirt_stack.peek());

    }
}