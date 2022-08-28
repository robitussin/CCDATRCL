import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);

        // get the element from the linked list
        String str = animals.get(1);
        System.out.print("Element at index 1: " + str);

        // change elements at index 3
        animals.set(2, "Chicken");
        System.out.println("Updated LinkedList: " + animals);

        // remove elements from index 1
        animals.remove(1);

        System.out.println("Updated LinkedList: " + animals);

        animals.addFirst("Monkey");

        System.out.println("Updated LinkedList: " + animals);
    }
}