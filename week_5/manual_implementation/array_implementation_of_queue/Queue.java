public class Queue {
    String array[];
    int front;
    int rear;
    int capacity;

    Queue(int size) {
        front = -1;
        rear = -1;
        array = new String[size];
        capacity = size;
    }

    // check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    // check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // insert elements to the queue
    void add(String element) {

        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                // mark front denote first element of queue
                front = 0;
            }

            // rear++;
            rear = (rear + 1) % capacity;
            // insert element at the rear
            array[rear] = element;
            System.out.println("Inserting " + element);
        }
    }

    // delete element from the queue
    void remove() {
        String element;

        // if queue is empty
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        } else {
            // remove element from the front of queue
            element = array[front];

            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                // mark next element as the front
                // front++;
                front = (front + 1) % capacity;

            }
            System.out.println("Removing " + element);
            return;
        }
    }

    // Returns the number of elements in the queue
    public int size() {
        return (rear + 1) - front;
    }

    // Display the element at the front of the queue
    public String peek() {
        if (front == -1) {
            System.out.println("There is no front element because the queue is empty!");
        }
        return array[front];
    }

    // Display all elements in the queue
    void printQueue() {

        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {

            // display element of the queue
            System.out.print("[");
            for (int i = front; i <= rear; i++) {

                System.out.print(array[i]);

                // Do not print a comma after the last element in the queue
                if (i != rear) {
                    System.out.print(", ");
                }

            }

            // display the rear of the queue
            System.out.println("]");
        }
    }
}