package prepare.algorithms.implementation;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = m - 1; i < s.size(); i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i - j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
