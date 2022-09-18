package hackerrank.prepare.algorithms.warmup;

import java.util.List;

public class PlusMinus {

    public void plusMinus(List<Integer> arr) {
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;
        for (int i : arr) {
            if (i > 0) {
                plusCount++;
            }
            if (i < 0) {
                minusCount++;
            }
            if (i == 0) {
                zeroCount++;
            }
        }
        System.out.printf("%10.6f%n", (double) plusCount / arr.size());
        System.out.printf("%10.6f%n", (double) minusCount / arr.size());
        System.out.printf("%10.6f%n", (double) zeroCount / arr.size());
    }
}
