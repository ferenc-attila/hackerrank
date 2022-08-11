package prepare.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127));
        arr.sort(Comparator.comparingInt(Integer::intValue));
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(i + 1);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
