public class App {
    public static void main(String[] args) {

        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Doubly Linked list
        song1.next = song2;
        song2.next = song3;
        song2.previous = song1;
        song3.previous = song2;

        // Print song before song 2
        System.out.println("Previous song is: " + song2.previous.title);

        // Print song after song 2
        System.out.println("Next song is: " + song2.next.title);

        // Print song before song 3
        System.out.println("Previous song is: " + song3.previous.title);
    }
}
