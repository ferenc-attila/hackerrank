package prepare.java.string;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        scanner.close();

        String input = "                        ";

        String[] result = input.stripLeading().stripTrailing().split("[\\s|!|,|\\?|\\.|_|'|@]{1,}");
        if (input.isBlank()) {
            System.out.println("0");
        } else {
            System.out.println(result.length);
            for (String token : result) {
                System.out.println(token);
            }
        }
    }
}
