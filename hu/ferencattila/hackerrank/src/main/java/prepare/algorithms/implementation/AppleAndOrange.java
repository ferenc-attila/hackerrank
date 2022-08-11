package prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        List<Integer> apples = new ArrayList<>(Arrays.asList(2, 3, -4));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(3, -2, -4));
        new AppleAndOrange().countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    private void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCounter = 0;
        int orangeCounter = 0;
        for (int apple : apples) {
            if (a + apple >= s && a + apple <= t) {
                appleCounter++;
            }
        }
        for (int orange : oranges) {
            if (b + orange >= s && b + orange <= t) {
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
