package java.prepare.java.string;

import java.util.Scanner;

public class SubstringComparision {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String smallest = "";
        String largest = "";

        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < original.length() - k + 1; i++) {
            String substring = original.substring(i, i + k);
            if (smallest.length() == 0) {
                smallest = substring;
            }
            if (largest.length() == 0) {
                largest = substring;
            }
            //Az alábbiakat ki kell szerveznoi egy segédmetódusba, és for ciklusban meghívni a megfelelő index-el.
            if (smallest.substring(0,1).toCharArray()[0] > substring.substring(0,1).toCharArray()[0]) {
                smallest = substring;
            }
            if (largest.substring(0,1).toCharArray()[0] < substring.substring(0,1).toCharArray()[0]) {
                largest = substring;
            }
        }

        System.out.println(smallest + "\n" + largest);
    }
}
