import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> HotelReservation = new LinkedList<>();

        // Adds elements to the queue
        HotelReservation.add("Neil");
        HotelReservation.add("Lawrence");
        HotelReservation.add("Mariel");
        HotelReservation.add("Jane");

        // Display all elements of the queue.
        System.out.println(HotelReservation);

        // Removes the element at the front of the queue
        HotelReservation.remove();

        // Returns the number of elements in the queue.
        System.out.println(HotelReservation.size());

        // Shows the element at the front of the queue
        System.out.println(HotelReservation.peek());

        // Display all elements of the queue.
        System.out.println(HotelReservation);
    }
}
