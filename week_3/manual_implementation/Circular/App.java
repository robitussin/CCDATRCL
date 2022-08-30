public class App {
    public static void main(String[] args) {

        // Circular Linked list
        // Create three nodes that will contain the song title
        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Create a link between each node
        song1.next = song2;
        song2.next = song3;
        // This creates a link between the last node and the first node
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
