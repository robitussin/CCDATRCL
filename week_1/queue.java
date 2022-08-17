import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        Queue<String> HotelReservationList = new LinkedList<>();

        HotelReservationList.add("Joe"); // Joe is first in reservation list
        HotelReservationList.add("Dany"); // Dany is second in reservation list
        HotelReservationList.add("Mike"); // Mike is third in reservation list
        HotelReservationList.add("Dave"); // Dave is last in the reservation list

        // Display contents of the reservation list.
        System.out.println(HotelReservationList);

        // If there is a room vacancy, remove the first person (Joe) in the list
        HotelReservationList.remove();

        // Display updated of the reservation list.
        System.out.println(HotelReservationList);

    }
}
