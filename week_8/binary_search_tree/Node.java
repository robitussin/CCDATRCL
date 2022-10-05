public class Node {

    // Node properties
    int number; // node data
    Node left; // Pointer to the left child
    Node right; // Pointer to the right child

    public Node(int number) {
        this.number = number;
        left = null; // Set left child pointer to null for each new node
        right = null; // Set right child pointer to null for each new node
    }
}