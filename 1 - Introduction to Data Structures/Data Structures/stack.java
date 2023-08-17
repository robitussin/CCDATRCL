import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<String> tshirt_stack = new Stack<>();

        // arranging t-shirts in a stack
        tshirt_stack.push("blue shirt");
        tshirt_stack.push("red shirt");
        tshirt_stack.push("yellow shirt");
        tshirt_stack.push("green shirt");

        // prints elements of the stack
        System.out.println("T-shirts in Stack: " + tshirt_stack);

        // Gets t-shirt at the top of the stack. This will get the green t-shirt which
        // is on top of the stack.
        tshirt_stack.pop();

        // prints elements of the stack without the green shirt
        System.out.println("T-shirts in Stack: " + tshirt_stack);

    }
}
