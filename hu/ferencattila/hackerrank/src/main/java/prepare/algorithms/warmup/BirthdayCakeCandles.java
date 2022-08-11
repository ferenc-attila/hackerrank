package prepare.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(4, 4, 1, 3));
        int max = Integer.MIN_VALUE;
        for (int i : candles) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        for (int i : candles) {
            if (i == max) {
                count++;
            }
        }
    }
}
