import java.util.Scanner;

// create MinHeapJavaImplementation class to create heap in Java
class MaxHeapJavaImplementation {

    // main() method start
    public static void main(String[] arg) {
        // declare variable
        int heapSize;

        // create scanner class object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Max Heap");
        heapSize = sc.nextInt();

        MaxHeap heapObj = new MaxHeap(heapSize * 2);

        for (int i = 1; i <= heapSize; i++) {
            System.out.print("Enter " + i + " element: ");
            int data = sc.nextInt();
            heapObj.insertNode(data);
        }

        // close scanner class obj
        sc.close();

        // construct a max heap from given data
        heapObj.designMaxHeap();

        // display the max heap data
        System.out.println("The Max Heap is ");
        heapObj.displayHeap();

        // removing the root node from the heap
        System.out.println("After removing the maximum element(Root Node) " +
                heapObj.removeRoot() + ", Max heap is:");
        heapObj.displayHeap();

    }
}