package hackerrank.prepare.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        List<List<Integer>> rows = readInput();
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> row : rows) {
            List<Integer> resultOfRow = new ArrayList<>();
            for (int i = 0; i < row.get(2); i++) {
                int partValue = row.get(0);
                for (int j = 0; j <= i; j++) {
                    partValue += Math.pow(2, j) * row.get(1);
                }
                resultOfRow.add(partValue);
            }
            result.add(resultOfRow);
        }
        for (List<Integer> resultOfRow : result) {
            for (int value : resultOfRow) {
                System.out.print(value + " ");
            }
            System.out.println("");
        }
    }

    private static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < cases; i++) {
            List<Integer> values = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                values.add(scanner.nextInt());
            }
            rows.add(values);
            if (i != cases - 1) {
                scanner.nextLine();
            }
        }
        scanner.close();
        return rows;
    }
}
