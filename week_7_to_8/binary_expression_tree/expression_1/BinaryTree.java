// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node A = new Node('+');
        // Create node B
        Node B = new Node('*');
        // Create node C
        Node C = new Node('5');
        // Create node D
        Node D = new Node('3');
        // Create node E
        Node E = new Node('2');

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(A);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
}