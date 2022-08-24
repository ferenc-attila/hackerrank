package prepare.java.string;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        String input = "madam";
        System.out.println(new IsPalindrome().isPalindrome(input));
    }

//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine();
//    scanner.close();

    public String isPalindrome(String input) {
        char[] inputChars = input.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] != inputChars[inputChars.length - 1 - i]) {
                return "No";
            }
        }
        return "Yes";
    }
}
