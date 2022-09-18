package hackerrank.prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    private List<Integer> gradingStudents(List<Integer> grades) {
        int difference = 3;
        List<Integer> result = new ArrayList<>();
        for (int i : grades) {
            if (i >= 38) {
                for (int j = 1; j < difference; j++) {
                    if ((i + j) % 5 == 0) {
                        i = i + j;
                    }
                }
            }
            result.add(i);
        }
        return result;
    }
}
