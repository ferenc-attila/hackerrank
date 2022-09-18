package hackerrank.prepare.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] args) {
        List<String> values = readInput();
        for (String value : values) {
            try {
                long number = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");
                if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                if (number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }
    }

    private static List<String> readInput() {
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            values.add(scanner.nextLine());
        }
        return values;
    }
}
