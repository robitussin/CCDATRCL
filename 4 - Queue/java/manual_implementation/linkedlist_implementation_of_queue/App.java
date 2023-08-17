public class App {
    public static void main(String[] args) {
        Queue HotelReservation = new Queue();

        // Adds elements to the queue
        HotelReservation.add("Neil");
        HotelReservation.add("Lawrence");
        HotelReservation.add("Mariel");
        HotelReservation.add("Jane");

        // Display all elements of the queue.
        HotelReservation.printQueue();

        // Removes the element at the front of the queue
        HotelReservation.remove();

        // Returns the number of elements in the queue.
        System.out.println(HotelReservation.size());

        // Shows the element at the front of the queue
        System.out.println(HotelReservation.peek());

        // Display all elements of the queue.
        HotelReservation.printQueue();
    }
}
