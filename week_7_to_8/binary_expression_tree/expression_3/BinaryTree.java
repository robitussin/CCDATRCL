// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Operators
        // Create root node A
        Node A = new Node("-");
        // Create node B
        Node B = new Node("+");
        // Create node C
        Node C = new Node("+");
        // Create node D
        Node D = new Node("*");
        // Create node E
        Node E = new Node("/");

        // Operands
        // Create node F
        Node F = new Node("2");
        // Create node G
        Node G = new Node("2");
        // Create node H
        Node H = new Node("5x");
        // Create node I
        Node I = new Node("7");
        // Create node J
        Node J = new Node("2");
        // Create node K
        Node K = new Node("2");

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = H;

        // Set left and right child of node C
        C.left = I;
        C.right = E;

        // Set left and right child of node D
        D.left = F;
        D.right = G;

        // Set left and right child of node E
        E.left = J;
        E.right = K;

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