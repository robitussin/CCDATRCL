// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node A = new Node('A');
        // Create node B
        Node B = new Node('B');
        // Create node C
        Node C = new Node('C');
        // Create node D
        Node D = new Node('D');
        // Create node E
        Node E = new Node('E');
        // Create node F
        Node F = new Node('F');
        // Create node G
        Node G = new Node('G');

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        // Set left and right child of node C
        C.left = F;
        C.right = G;
    }
}