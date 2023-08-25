import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up scanner class
        Scanner Input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Please Input A String To Count:");

        // get input
        String quote = Input.nextLine();

        // trim the string to make it case-insensitive and remove all non-alphabetic characters
        quote = stringTrimmer(quote);

        // turn string into character array
        char[] charactersInString = quote.toCharArray();

        // Hash map for loop below
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // Iterates over each string value
        for (char index: charactersInString) {
            // If hashmap doesn't exist for our current string value
            if (!characterCounts.containsKey(index)) {
                // Make hashmap for that value, making the character the key and our value 1
                characterCounts.put(index, 1);
            }
            // if hashmap does exist for our current value
            else {
                // increment that hashmap's value by 1
                characterCounts.put(index, characterCounts.get(index) + 1);
            }
        }

        mapHashMap(characterCounts);
    }

    // use Map to display every key and value pair for every entry in our hash map
    static void mapHashMap(HashMap<Character, Integer> characterCounts) {
        for (Map.Entry<Character, Integer> CountsMap : characterCounts.entrySet()) {
            System.out.println(CountsMap.getKey() + ": " + CountsMap.getValue());
        }
    }

    // trim the string to make it case-insensitive and remove all non-alphabetic characters
    static String stringTrimmer(String quote) {
        // make character counts case-insensitive
        quote = quote.toLowerCase();
        // remove all non-lowercase alphabet letters
        quote = quote.replaceAll("[^a-z]", "");
        return quote;
    }
}