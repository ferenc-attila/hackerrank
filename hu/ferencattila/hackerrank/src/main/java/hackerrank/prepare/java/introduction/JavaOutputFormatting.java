package hackerrank.prepare.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        JavaOutputFormatting formatting = new JavaOutputFormatting();
        List<String> input = formatting.readInput();
        List<String> firstColumn = formatting.splitColumns(input, 0);
        List<String> secondColumn = formatting.splitColumns(input, 1);
        System.out.println("================================");
        for (int i = 0; i < input.size(); i++) {
            String integerString = String.format("%03d", Integer.parseInt(secondColumn.get(i)));
            System.out.printf("%-15s%s%n", firstColumn.get(i), integerString);
        }
        System.out.println("================================");
    }

    private List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList();
        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }
        scanner.close();
        return input;
    }

    private List<String> splitColumns(List<String> input, int columnIndex) {
        List<String> column = new ArrayList<>();
        for (String row : input) {
            String[] columns = row.split(" ");
            column.add(columns[columnIndex]);
        }
        return column;
    }
}
