class Queue {

    class Node {

        // Node Properties
        String data;
        Node next;

        // constructor to create a new linked list node
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue Properties
    static Node front;
    static Node rear;
    static int nodeCount;

    // Constructor
    public Queue() {
        front = null;
        rear = null;
        nodeCount = 0;
    }

    // Adds a new element to the queue
    void add(String data) {

        // Create a new Linked list node
        Node temp = new Node(data);

        System.out.println("Inserting " + data);

        // Increase node count by 1
        nodeCount += 1;

        // If queue is empty, then new node is front and rear both
        if (rear == null) {
            front = temp;
            rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        rear.next = temp;
        rear = temp;
    }

    // Removes the element at the front of the queue.
    void remove() {
        // If queue is empty, return NULL.
        if (front == null) {
            System.out.println("The queue is empty!");
            return;
        }

        System.out.println("Removing " + front.data);

        // Store previous front and move front one node ahead
        front = front.next;

        // If front becomes NULL, then change rear also as NULL
        if (front == null)
            rear = null;

        // Decrease node count by 1
        nodeCount -= 1;
    }

    // Returns the number of elements in the queue.
    public int size() {
        return nodeCount;
    }

    // Returns the element at the front of the queue.
    public String peek() {
        if (nodeCount == 0) {
            System.out.println("There is no front element because the queue is empty!");
            return "";
        }
        return front.data;
    }

    // Displays all elements in the queue
    public void printQueue() {

        if (nodeCount == 0) {
            System.out.println("The queue is empty!");
            return;
        }

        Node current = Queue.front;

        int count = Queue.nodeCount;

        System.out.print("[");
        while (count > 0) {

            System.out.print(current.data);

            if (count > 1) {
                System.out.print(", ");
            }

            current = current.next;
            count--;
        }

        System.out.println("]");
    }
}