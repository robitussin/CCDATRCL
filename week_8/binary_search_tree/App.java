public class App {
    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Create/Insert nodes
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(10);
        tree.insert(9);
        tree.insert(12);

        // Show all nodes using inorder traversal.
        tree.traverseInorder();

        // Search if node exists in the binary search tree.
        tree.search(10);

        // Remove node 10
        tree.delete(10);

        // Show all nodes using inorder traversal.
        tree.traverseInorder();

        // Search if node exists in the binary search tree.
        tree.search(10);
    }
}
