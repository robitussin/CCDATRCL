public class App {
    public static void main(String[] args) {

        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Circular Linked list
        song1.next = song2;
        song2.next = song3;
        song3.next = song1;

        // Print song after song 1
        System.out.println("Next song is: " + song1.next.title);
        ;
        // Print song after song 2
        System.out.println("Next song is: " + song2.next.title);

        // Print song after song 3
        System.out.println("Next song is: " + song3.next.title);
    }
}
