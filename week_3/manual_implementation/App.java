public class App {
    public static void main(String[] args) {

        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        // Count total nodes
        System.out.println(countNodes(nodeA));

        // Traverse element in linked list
        traverse(nodeA);

        // Insert element after an existing element
        insertAfter(nodeD, 9);

        // Traverse linked list
        traverse(nodeA);

        // Insert element at the end
        insertAtEnd(nodeA, 8);

        // Traverse linked list
        traverse(nodeA);

        // Delete element in linked list
        delete(nodeA, 4);

        // Traverse linked list
        traverse(nodeA);
    }

    static int countNodes(Node head) {
        int count = 1;
        Node current = head;

        while (current.next != null) {
            current = current.next;
            count += 1;
        }

        return count;
    }

    static void traverse(Node head) {
        Node current = head;

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    static void insertBeginning(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode = head;
        head = newNode;
    }

    static void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    static void insertAtEnd(Node head, int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        return;
    }

    static void delete(Node head, int position) {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        Node next = temp.next.next;

        temp.next = next;
    }
}
