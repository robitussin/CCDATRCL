import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> HotelReservation = new LinkedList<>();

        // Adds elements to the queue
        HotelReservation.add("Elizer");
        HotelReservation.add("Lawrence");
        HotelReservation.add("Neil");
        HotelReservation.add("Mariel");
        HotelReservation.add("Jane");

        // Display all elements of the queue.
        System.out.println("Elements of queue " + HotelReservation);

        // Removes the element at the front of the queue
        HotelReservation.remove();

        // Display all elements of the queue.
        System.out.println(HotelReservation);

        // Returns the number of elements in the queue.
        System.out.println(HotelReservation.size());

        // Shows the element at the front of the queue
        System.out.println(HotelReservation.peek());
    }
}
