// Binary Search Tree operations in Java

class BinarySearchTree {

  Node root;

  BinarySearchTree() {
    root = null;
  }

  void insert(int number) {
    root = insertNode(root, number);
  }

  // Insert key in the tree
  Node insertNode(Node root, int number) {
    // Return a new node if the tree is empty
    if (root == null) {
      root = new Node(number);
      return root;
    }

    // Traverse to the right place and insert the node
    if (number < root.number)
      root.left = insertNode(root.left, number);
    else if (number > root.number)
      root.right = insertNode(root.right, number);

    return root;
  }

  void traverseInorder() {
    traverseInorderFromRoot(root);
    System.out.println("");
  }

  // Inorder Traversal
  void traverseInorderFromRoot(Node root) {
    if (root != null) {
      traverseInorderFromRoot(root.left);
      System.out.print(root.number + " -> ");
      traverseInorderFromRoot(root.right);
    }
  }

  void delete(int number) {
    root = deleteNode(root, number);
  }

  Node deleteNode(Node root, int number) {
    // Return if the tree is empty
    if (root == null)
      return root;

    // Find the node to be deleted
    if (number < root.number)
      root.left = deleteNode(root.left, number);
    else if (number > root.number)
      root.right = deleteNode(root.right, number);
    else {
      // If the node is with only one child or no child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // If the node has two children
      // Place the inorder successor in position of the node to be deleted
      root.number = minValue(root.right);

      // Delete the inorder successor
      root.right = deleteNode(root.right, root.number);
    }

    return root;
  }

  // Find the inorder successor
  int minValue(Node root) {
    int minv = root.number;
    while (root.left != null) {
      minv = root.left.number;
      root = root.left;
    }
    return minv;
  }

  void search(int number) {

    if (searchNode(root, number) != null) {
      // If the searchNode method does not return null
      System.out.println("Node exists");
    } else {
      // If the searchNode method returns null
      System.out.println("Node does not exist");
    }
  }

  Node searchNode(Node root, int number) {
    // If root is null or the number to be searched is equal to the number of the
    // root, return the root
    if (root == null || root.number == number) {
      return root;
    }

    // If the number to be searched is less than the number of the root, start the
    // search at the left child of the root.
    if (number < root.number) {
      return searchNode(root.left, number);
    }

    // If the number to be searched is less than the number of the root, start the
    // search at the right child of the root.
    if (number > root.number) {
      return searchNode(root.right, number);
    }

    return root;
  }
}