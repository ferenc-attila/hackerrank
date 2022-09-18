package hackerrank.prepare.java.string;

import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String smallest = "";
        String largest = "";

        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

//        String original = "fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
//        int k = 100;

        for (int i = 0; i < original.length() - k + 1; i++) {
            String substring = original.substring(i, i + k);
            if (smallest.length() == 0) {
                smallest = substring;
            }
            if (largest.length() == 0) {
                largest = substring;
            }

            smallest = getSmallest(0, smallest, substring);
            largest = getLargest(0, largest, substring);
        }

        System.out.println(smallest + "\n" + largest);

        if (!largest.equals("yotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgklj")) {
            System.out.println("Largest false!");
        }

        if (!smallest.equals("DJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljh")) {
            System.out.println("Smallest false!");
        }
    }

    private static String getLargest(int firstIndex, String largest, String substring) {
        if (largest.equals(substring)) {
            return largest;
        }
        if (largest.substring(firstIndex, firstIndex + 1).toCharArray()[0] < substring.substring(firstIndex, firstIndex + 1).toCharArray()[0]) {
            largest = substring;
        }
        if (largest.substring(firstIndex, firstIndex + 1).toCharArray()[0] == substring.substring(firstIndex, firstIndex + 1).toCharArray()[0]) {
            largest = getLargest(firstIndex + 1, largest, substring);
        }
        return largest;
    }

    private static String getSmallest(int firstIndex, String smallest, String substring) {
        if (smallest.equals(substring)) {
            return smallest;
        }
        if (smallest.substring(firstIndex, firstIndex + 1).toCharArray()[0] > substring.substring(firstIndex, firstIndex + 1).toCharArray()[0]) {
            smallest = substring;
        }
        if (smallest.substring(firstIndex, firstIndex + 1).toCharArray()[0] == substring.substring(firstIndex, firstIndex + 1).toCharArray()[0]) {
            smallest = getSmallest(firstIndex + 1, smallest, substring);
        }
        return smallest;
    }
}
