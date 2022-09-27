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
        // Create node F
        Node H = new Node('H');
        // Create node G
        Node I = new Node('I');

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        // Set left and right child of node C
        C.left = F;
        C.right = G;

        // Set left and right child of node D
        D.left = H;
        D.right = I;

        System.out.println(isLeaf(G));
        System.out.println(getHeight(D));
        System.out.println(getDegree(H));
    }

    static boolean isLeaf(Node node){
        if(node.left == null && node.right == null)
        {
            return true;
        }
            
        return false;
    }

    static boolean isParent(Node node){
        if(node.left != null || node.right != null)
        {
            return true;
        }
            
        return false;
    }

    // method to return maximum of two numbers
    static int getMax(int a, int b){
        return (a > b) ? a : b;
    }

    // method to get the height of a tree or node
    static int getHeight(Node node){
        if(node == null || isLeaf(node)) // height will be 0 if the node is leaf or null
            return 0;

        //height of a node will be 1+ greater among height of right subtree and height of left subtree
        return(getMax(getHeight(node.left), getHeight(node.right)) + 1);
    } 

    // method to get the degree of node
    static int getDegree(Node node)
    {
        int count = 0;

        if(node.left != null)
        {
            count++;
        }
    
        if(node.left != null)
        {
            count++;
        }    

        return count;
    }

}
