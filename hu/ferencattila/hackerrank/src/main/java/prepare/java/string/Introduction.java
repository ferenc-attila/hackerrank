package java.prepare.java.string;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        scanner.close();

        System.out.println(firstString.length() + secondString.length());

        if (firstString.toCharArray()[0] > secondString.toCharArray()[0]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String firstCapitalizedString = firstString.substring(0,1).toUpperCase() + firstString.substring(1, firstString.length());

        String secondCapitalizedString = secondString.substring(0,1).toUpperCase() + secondString.substring(1, secondString.length());

        System.out.println(firstCapitalizedString + " " + secondCapitalizedString);
    }
}
