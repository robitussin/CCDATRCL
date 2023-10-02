public class Node {

    // Every node has three properties
    // 1. Key/Data
    char data;

    // 2. Pointer to the left child
    Node left;

    // 3. Pointer to the right child
    Node right;

    // Constructor
    public Node(char data) {

        // Set node data
        this.data = data;

        // Initialize left and right pointers to NULL.
        left = null;
        right = null;
    }
}
