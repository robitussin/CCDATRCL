// Java program to demonstrate working of HashTable 

import java.util.*;

public class HashTable {
    public static void main(String args[]) {
        Hashtable<String, Integer> songbook = new Hashtable<String, Integer>();

        // Put
        // Inserts key-value pairs in a hash table.
        songbook.put("High Hopes", 0000);
        songbook.put("This Love", 1111);
        songbook.put("God's Plan", 2222);
        songbook.put("Sugar", 3333);

        // Remove
        // Removes key-value pairs in a hash table.
        songbook.remove("This Love");

        // Get
        // Retrieves a value in a hash table using a key.
        System.out.println(songbook.get("Sugar"));

        // Size
        // Returns the total number of key-value pairs in the hash table.
        System.out.println(songbook.size());

        // Show all content of hash table
        System.out.println(songbook);

        // Clear
        // Resets and empties the hash table.
        songbook.clear();
    }
}