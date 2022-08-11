package prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 4));
        List<Integer> b = new ArrayList<>(Arrays.asList(16, 32, 96));
        System.out.println(new BetweenTwoSets().getTotalX(a, b));
    }

    private int getTotalX(List<Integer> a, List<Integer> b) {
        int counter = 0;
        for (int i = a.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE); i <= b.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE); i++) {
            int finalI = i;
            if (a.stream().allMatch(integer -> finalI % integer == 0) && b.stream().allMatch(integer -> integer % finalI == 0)) {
                counter++;
            }
        }
        return counter;
    }
}
