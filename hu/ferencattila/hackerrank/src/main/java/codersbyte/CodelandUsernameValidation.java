package codersbyte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {

    //Simple if solution
    public static String CodelandUsernameValidation(String str) {
        char[] characters = str.toCharArray();
        boolean result = true;
        for (char c : characters) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                result = false;
            }
        }
        if (characters.length < 4 || characters.length > 25) {
            result = false;
        }
        if (!Character.isAlphabetic(characters[0])) {
            result = false;
        }
        if (characters[str.length() - 1] == '_') {
            result = false;
        }
        return Boolean.toString(result);
    }

    public static String CodelandUsernameValidationWithRegex(String str) {
        Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z0-9_]{2,22}[$A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);
        return Boolean.toString(matcher.matches());
    }

    public static void main(String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
        System.out.println(CodelandUsernameValidationWithRegex("aa_a"));
        System.out.println(CodelandUsernameValidationWithRegex("u__hello_world123"));
        System.out.println(CodelandUsernameValidationWithRegex("_aaa"));
        System.out.println(CodelandUsernameValidationWithRegex("a123456789101112131415161"));
        System.out.println(CodelandUsernameValidationWithRegex("a12"));
        System.out.println(CodelandUsernameValidationWithRegex("1a12"));
        System.out.println(CodelandUsernameValidationWithRegex("1!a12"));
        System.out.println(CodelandUsernameValidationWithRegex("aaa_"));
    }
}
