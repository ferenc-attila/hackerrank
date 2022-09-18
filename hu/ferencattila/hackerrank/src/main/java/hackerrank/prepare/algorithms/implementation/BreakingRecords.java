package hackerrank.prepare.algorithms.implementation;

import java.util.List;

public class BreakingRecords {

    public List<Integer> breakingRecords(List<Integer> scores) {
        int minValue = scores.get(0);
        int maxValue = scores.get(0);
        int breakingMax = 0;
        int breakingMin = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxValue) {
                maxValue = scores.get(i);
                breakingMax++;
            }
            if (scores.get(i) < minValue) {
                minValue = scores.get(i);
                breakingMin++;
            }
        }
        return List.of(breakingMax, breakingMin);
    }
}
