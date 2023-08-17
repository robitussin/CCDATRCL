public class App {
    public static void main(String[] args) {

        // Better approach
        int sum = 0; // O(1)
        int n = 5;
        sum = n * (n + 1) / 2; // O(1)

        System.out.println(sum); // O(1)
    }
}
