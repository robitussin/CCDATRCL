public class App {
    public static void main(String[] args) {

        // Singly Linked list
        // Create three nodes that will contain the song title
        Playlist song1 = new Playlist("Pare ko");
        Playlist song2 = new Playlist("Overdrive");
        Playlist song3 = new Playlist("Alapaap");

        // Create a link between each node
        song1.next = song2;
        song2.next = song3;

        // Count total nodes in the linked list
        System.out.println("Total Songs in playlist are: " + countNodes(song1));

        // Go through all nodes in the linked list
        traverse(song1);

        // Insert a new node after an existing node
        insertAfter(song3, "With a Smile");

        // Insert a new node at the end of the linked list
        insertAtEnd(song1, "Magasin");

        // Deletes a node in the linked list
        delete(song1, 4);

        // Go through all nodes in the linked list
        traverse(song1);
    }

    static int countNodes(Playlist song) {
        int count = 1;
        Playlist current = song;

        while (current.next != null) {
            current = current.next;
            count += 1;
        }

        return count;
    }

    static void traverse(Playlist song) {
        Playlist current = song;

        while (current != null) {
            System.out.println(current.title + " ");
            current = current.next;
        }
    }

    static void insertBeginning(Playlist song, String title) {
        Playlist newSong = new Playlist(title);
        newSong = song;
        song = newSong;
    }

    static void insertAfter(Playlist prevSong, String title) {
        if (prevSong == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Playlist newSong = new Playlist(title);
        newSong.next = prevSong.next;
        prevSong.next = newSong;
    }

    static void insertAtEnd(Playlist song, String title) {
        Playlist newNode = new Playlist(title);

        if (song == null) {
            song = new Playlist(title);
            return;
        }

        newNode.next = null;

        Playlist last = song;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        return;
    }

    static void delete(Playlist song, int position) {
        if (song == null)
            return;

        Playlist temp = song;

        if (position == 0) {
            song = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        Playlist next = temp.next.next;

        temp.next = next;
    }
}
