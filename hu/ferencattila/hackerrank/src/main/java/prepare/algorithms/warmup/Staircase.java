package prepare.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

public class Staircase {

    public static void main(String[] args) {
        int n = 6;
        List<String> rows = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n; j >= 0; j--) {
                if (j < i) {
                    sb.append("#");
                }
                if (j > i) {
                    sb.append(" ");
                }
            }
            rows.add(sb.toString());
        }
        for (String row : rows) {
            System.out.println(row);
        }
    }
}
