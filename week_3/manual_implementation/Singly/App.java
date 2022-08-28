public class App {
    public static void main(String[] args) {

        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Singly Linked list
        song1.next = song2;
        song2.next = song3;

        // Print next song after song 1
        System.out.println(song1.next.title);

        // Print next song after song 2
        System.out.println(song2.next.title);
    }
}
