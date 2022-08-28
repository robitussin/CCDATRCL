import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // create linkedlist
        LinkedList<String> Playlist = new LinkedList<>();

        // Real world examples: Train, music/video playlists

        // Add elements to LinkedList
        Playlist.add("Pare ko");
        Playlist.add("Overdrive");
        Playlist.add("Alapaap");
        System.out.println("Current playlist: " + Playlist);

        // add() method with the index parameter
        Playlist.add(1, "With a Smile");
        System.out.println("Updated playlist: " + Playlist);

        // get the element from the linked list
        String str = Playlist.get(1);
        System.out.print("Element at index 1: " + str);

        // change elements at index 3
        Playlist.set(2, "Magasin");
        System.out.println("Updated playlist: " + Playlist);

        // remove elements from index 1
        Playlist.remove(1);

        System.out.println("Updated playlist: " + Playlist);

        Playlist.addFirst("Monkey");

        System.out.println("Updated playlist: " + Playlist);

        // Iterate through playlist using for each
        for (String song : Playlist) {
            System.out.println(song);
        }
    }
}