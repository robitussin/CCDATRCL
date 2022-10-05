
// create MinHeapJavaImplementation class to create heap in Java  
import java.util.Scanner;

public class App {

    // main() method start
    public static void main(String[] arg) {
        // declare variable
        int heapSize;

        // create scanner class object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Min Heap");
        heapSize = sc.nextInt();

        MinHeap heapObj = new MinHeap(heapSize * 2);

        for (int i = 1; i <= heapSize; i++) {
            System.out.print("Enter " + i + " element: ");
            int data = sc.nextInt();
            heapObj.insertNode(data);
        }

        // close scanner class obj
        sc.close();

        // construct a min heap from given data
        heapObj.designMinHeap();

        // display the min heap data
        System.out.println("The Min Heap is ");
        heapObj.displayHeap();

        // removing the root node from the heap
        System.out.println("After removing the minimum element(Root Node) " +
                heapObj.removeRoot() + ", Min heap is:");
        heapObj.displayHeap();

    }
}