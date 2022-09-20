import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<String> HotelReservation = new LinkedList<>();
        
        // Use a while loop to put a limit on the number of elements to enqueue/add
        while (HotelReservation.size() < 5) {
            
            System.out.println("Enter your name for reservation: ");
            String name = scan.nextLine();
            HotelReservation.add(name);
        }

        System.out.println("Enter number of people to remove from queue: ");
        int num = scan.nextInt();
     
        // This loop will remove elements in the queue depending on the number entered by the user.
        for (int i = 0; i < num; i++) {
            HotelReservation.remove();
        }

        System.out.println("Reservations are : " + HotelReservation);


        Queue<Double> TicketReservations = new LinkedList<>();

        // This loop will automatically add 50 random elements in the queue.
        for (int i = 0; i <= 50; i++) {
            TicketReservations.add(Math.random());
        }

        System.out.println(TicketReservations);

    }
}
