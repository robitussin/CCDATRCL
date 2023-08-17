import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Pare ko");
        Playlist.add("Overdrive");
        Playlist.add("Alapaap");
        Playlist.add("Huling El Bimbo");
        Playlist.add("Huwag kang Matakot");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("With a Smile");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Fruitcake");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Magasin");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}