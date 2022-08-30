public class App {
    public static void main(String[] args) {

        // Doubly Linked list
        // Create three nodes that will contain the song title
        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Create a link between each node
        song1.next = song2;
        song2.next = song3;
        // This creates a link between the current node and the previous node
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
