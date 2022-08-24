package prepare.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

//        String firstInput = "anagram";
//        String secondInput = "margana";

        if (isAnagrams(firstInput, secondInput)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    private static boolean isAnagrams(String firstInput, String secondInput) {
        if (firstInput.length() != secondInput.length()) {
            return false;
        }
        Map<Character, Integer> firstCharacterCounts = countCharacters(firstInput.toLowerCase());
        Map<Character, Integer> secondCharacterCounts = countCharacters(secondInput.toLowerCase());

        for (Map.Entry<Character, Integer> entry : firstCharacterCounts.entrySet()) {
            Character key = entry.getKey();
            if (!secondCharacterCounts.containsKey(key)) {
                return false;
            }
            if (firstCharacterCounts.get(key) != (secondCharacterCounts.get(key))) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> result = new HashMap<>();
        char[] characters = input.toCharArray();
        for (char character : characters) {
            if (result.containsKey(character)) {
                result.put(character, result.get(character) + 1);
            } else {
                result.put(character, 1);
            }
        }
        return result;
    }
}
