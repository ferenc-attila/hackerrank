package prepare.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        List<String> content = readInput();
        for (int i = 0; i < content.size(); i++) {
            System.out.println(i + 1 + " " + content.get(i));
        }
    }

    private static List<String> readInput() {
        List<String> content = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            content.add(scanner.nextLine());
        }
        return content;
    }
}
