
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        // ArrayLists in Java are a part of the Java Collections Framework and provide a resizable array implementation. 
        // They are used to store dynamically sized collections of elements. 
        // ArrayLists can hold objects and provide methods for adding, removing, and accessing elements.

        // Example of using an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in the ArrayList: " + names);

        // Accessing elements
        String firstName = names.get(0);
        System.out.println("First name: " + firstName);


        names.set(0, "David"); // Modifying an element


        Collections.sort(names); // Sorting the ArrayList

        for(String name : names) {      //for loop to iterate through the ArrayList
            System.out.println(name);
        }


        // Removing an element
        names.remove("Bob");
        System.out.println("Names after removal: " + names);
    }
    
}
