import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        // 1. Create an ArrayList<Integer> and add 5 integers. Print the list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Original ArrayList:");
        System.out.println(numbers);


        // 2. Convert a Vector<String> to an ArrayList<String>
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        ArrayList<String> arrayListFromVector = new ArrayList<>(vector);

        System.out.println("\nVector converted to ArrayList:");
        System.out.println(arrayListFromVector);


        // 3. Remove all even numbers from an ArrayList<Integer> using an iterator
        ArrayList<Integer> evenTest = new ArrayList<>(numbers); // copy original list

        Iterator<Integer> iterator = evenTest.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("\nArrayList after removing even numbers:");
        System.out.println(evenTest);


        // Challenge: Find longest string
        List<String> words = Arrays.asList("Java", "Programming", "AI", "Collection");
        String longest = findLongestString(words);

        System.out.println("\nLongest String:");
        System.out.println(longest);
    }


    // Challenge Method
    public static String findLongestString(List<String> list) {
        String longest = "";

        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
