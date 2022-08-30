import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist object
        LinkedList<String> Playlist = new LinkedList<>();

        // Real world examples: Train, music/video playlists

        // Add new nodes to LinkedList
        Playlist.add("Pare ko");
        Playlist.add("Overdrive");
        Playlist.add("Alapaap");

        // Display all nodes in the LinkedList
        System.out.println("Current playlist: " + Playlist);

        // Adds a new node at a certain position in the LinkedList
        Playlist.add(1, "With a Smile");

        // Display all nodes in the LinkedList
        System.out.println("Updated playlist: " + Playlist);

        // Retrieves the node at a certain position from the LinkedList
        String str = Playlist.get(1);

        // Display node at position 1 in the LinkedList
        System.out.print("Element at index 1: " + str);

        // Change node data at index 3 in the LinkedList
        Playlist.set(2, "Magasin");

        // Display node at position 1 in the LinkedList
        System.out.println("Updated playlist: " + Playlist);

        // Remove node at index 1
        Playlist.remove(1);

        // Display all nodes in the LinkedList
        System.out.println("Updated playlist: " + Playlist);

        // Iterate through LinkedList
        for (String song : Playlist) {
            System.out.println(song);
        }
    }
}