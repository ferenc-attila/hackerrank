package prepare.java.string;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        scanner.close();

        System.out.println(string.substring(first, second));
    }
}
