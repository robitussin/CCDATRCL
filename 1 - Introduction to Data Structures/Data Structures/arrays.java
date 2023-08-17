public class App {
    public static void main(String[] args) {

        // Array of Strings
        String[] myfavefastfood = { "Jollibee", "Mcdonalds", "KFC", "MangInasal", "Chowking" };

        System.out.println("This is my most favorite fast food restaurant:");
        // Prints top 1 favorite fast food
        System.out.println(myfavefastfood[0]);

        System.out.println("This is my least favorite fast food restaurant:");
        // Prints top 5 favorite fast food
        System.out.println(myfavefastfood[4]);

        System.out.println("This is all of my favorite fast food restaurants:");
        // Print all favorite fast food
        for (int i = 0; i < 5; i++) {
            System.out.println(myfavefastfood[i]);
        }

        // Question: What if you want to add another restaurant (ex. Burgerking) into
        // the array?
        // Answer: You cannot. You will need to create another array in order to add
        // another element

        String[] mynewfavefastfood = { "Jollibee", "Mcdonalds", "KFC", "MangInasal", "Chowking", "BurgerKing" };

        // Array of Integers
        int[] myfavoriteNumbers = { 11, 22, 33, 44, 55 };

        // Array of Char
        char[] myfavoriteLetters = { 'A', 'B', 'C', 'D', 'E' };

        // Array of Symbols
        char[] myfavoriteSy = { '4', '!', 'C', '$', 'E' };
    }
}
