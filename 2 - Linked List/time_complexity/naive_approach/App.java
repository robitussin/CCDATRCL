public class App {
    public static void main(String[] args) {

        int sum = 0; // O(1)
        for (int i = 0; i <= 5; i++) { // O(n)
            sum = sum + i;
        }
        System.out.println(sum); // O(1)
    }
}
