public class App {
    public static void main(String[] args) {

        // Singly Linked list
        // Create three nodes that will contain the song title
        Song song1 = new Song("Pare ko");
        Song song2 = new Song("Overdrive");
        Song song3 = new Song("Alapaap");

        // Create a link between each node
        song1.next = song2;
        song2.next = song3;

        // Print next song after song 1
        System.out.println(song1.next.title);

        // Print next song after song 2
        System.out.println(song2.next.title);
    }
}
