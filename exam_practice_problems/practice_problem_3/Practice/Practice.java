// Binary Tree in Java
public class Practice {

    public static void main(String[] args) {

        // Part 1: Binary Tree Traversal
        // Print the required string pattern by constructing a binary tree and traverse
        // each node using a specific traversal method.

        System.out.println("1. Print \"APPLE\" using IN-ORDER Traversal");
        Node A = new Node('A');
        Node B = new Node('P');
        Node C = new Node('P');
        Node D = new Node('L');
        Node E = new Node('E');

        // ===========================================================================================
        System.out.println("");
        System.out.println("2. Print \"MANGO\" using PRE-ORDER Traversal");
        A = new Node('M');
        B = new Node('A');
        C = new Node('N');
        D = new Node('G');
        E = new Node('O');

        // ===========================================================================================
        System.out.println("");
        System.out.println("3. Print \"LEMON\" using POST-ORDER Traversal");
        A = new Node('L');
        B = new Node('E');
        C = new Node('M');
        D = new Node('O');
        E = new Node('N');

        // ===========================================================================================
        // Part 2: Binary Expression Tree
        // Print the expression by constructing a binary expression tree and traverse
        // each node using INORDER traversal

        System.out.println("");
        System.out.println("4. Print the expression \"1 / 5 - 3\" using IN-ORDER Traversal");
        A = new Node('-');
        B = new Node('/');
        C = new Node('1');
        D = new Node('5');
        E = new Node('3');

        // ===========================================================================================
        System.out.println("");
        System.out.println("5. Print the expression \"8 / 3 + 4 - 2 * 5\" using IN-ORDER Traversal");
        A = new Node('*');
        B = new Node('+');
        C = new Node('-');
        D = new Node('/');
        E = new Node('8');
        Node F = new Node('3');
        Node G = new Node('4');
        Node H = new Node('2');
        Node I = new Node('5');
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}