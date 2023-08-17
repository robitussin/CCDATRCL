
// Import the LinkedList class
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        // The LinkedList stores its items in "containers."
        // The list has a link to the first container and each container has a link to
        // the next container in the list.
        // To add an element to the list, the element is placed into a new container and
        // that container is linked to one of the other containers in the list.

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // get the element from the linked list
        String str = cars.get(1);
        System.out.println("Element at index 1: " + str);

        // change elements at index 3
        // Replaces Mazda with Toyota
        cars.set(3, "Toyota");
        System.out.println("Updated LinkedList: " + cars);

        // remove elements from index 1
        String removed_element = cars.remove(1);
        System.out.println("Removed Element: " + removed_element);

        System.out.println("Updated LinkedList: " + cars);
    }
}
