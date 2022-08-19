// class to create nodes
class Node {
    String key;
    Node left, right;

    public Node(String item) {
        key = item;
        left = right = null;
    }
}

class App {
    Node root;

    // Traverse tree
    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.key);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {

        // create an object of BinaryTree
        App tree = new App();

        // create nodes of the tree
        tree.root = new Node("General");
        tree.root.left = new Node("Colonel");
        tree.root.right = new Node("Colonel");
        tree.root.left.left = new Node("Major");

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
    }
}
