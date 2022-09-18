package hackerrank.prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int actualHeight = 0;
        int numberOfValleys = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                actualHeight++;
            } else {
                if (actualHeight == 0) {
                    actualHeight--;
                    numberOfValleys++;
                } else {
                    actualHeight--;
                }
            }
        }
        return numberOfValleys;
    }
}
