
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your favorite fruit
        char[] apple = { 'A', 'P', 'P', 'L', 'E' };

        // 2. Display each character of the fruit in each line.
        for (int i = 0; i < apple.length; i++) {
            System.out.println(apple[i]);
        }

        // 3. Display the first character of the fruit
        System.out.println(apple[0]);

        // 4. Display the last character of the fruit
        System.out.println(apple[4]);

        // 5. Display the character of the fruit in reverse order
        for (int i = apple.length - 1; i >= 0; i--) {
            System.out.println(apple[i]);
        }

        // Linked List
        // ======================================================
        // 1. Create a Linked list of characters of your pet name
        LinkedList<String> petName = new LinkedList<>();

        petName.add("B");
        petName.add("L");
        petName.add("A");
        petName.add("C");
        petName.add("K");
        petName.add("Y");

        // System.out.println(petName);

        // 2. Add "Z" to the head/front of the Linked list
        petName.addFirst("Z");

        // System.out.println(petName);

        // 3. Add "X" to the tail/end of the Linked list
        petName.addLast("X");

        // 4. Display the last character of the Linked list
        System.out.println(petName.get(7));

        // 5. Replace the last character of the Linked list with "!";
        petName.set(7, "!");

        // 6. Remove the first character of the Linked list
        petName.remove(0);

        // // 7. Display the LinkedList
        System.out.println(petName);

        // Stack
        // ======================================================
        // 1. Create a Stack of characters of your favorite fruit

        Stack<String> fruit = new Stack<>();

        fruit.push("M");
        fruit.push("A");
        fruit.push("N");
        fruit.push("G");
        fruit.push("O");

        // 2. Print the Stack
        System.out.println(fruit);

        // 3. Add a "SHAKE" to the stack
        fruit.push(" ");
        fruit.push("S");
        fruit.push("H");
        fruit.push("A");
        fruit.push("K");
        fruit.push("E");

        // 4. Print the Stack
        System.out.println(fruit);

        // 5. Remove "SHAKE" and add "ICE CREAM"
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();

        fruit.push("I");
        fruit.push("C");
        fruit.push("E");
        fruit.push(" ");
        fruit.push("C");
        fruit.push("R");
        fruit.push("E");
        fruit.push("A");
        fruit.push("M");

        // 6. Print the Stack
        System.out.println(fruit);
    }
}
