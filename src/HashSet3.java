import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        // Call the function to fill the HashSet
        HashSet<String> hashSet = fillHashSet();

        String objectToRemove = "2";

        // Iterate over the set and remove the object if found
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(objectToRemove)) {
                iterator.remove();
            }
        }

        System.out.println(hashSet);

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is the HashSet empty? : " + isEmpty);
    }
    // Create a method that fill the HashSet
    public static HashSet<String> fillHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        return hashSet;
    }
}