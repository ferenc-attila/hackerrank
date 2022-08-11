package prepare.algorithms.implementation;

import java.util.List;

public class MigratoryBirds {

    public int migratoryBirds(List<Integer> arr) {
        int typeWithMaxAmount = 0;
        int maxCount = 0;
        for (int i = 1; i <= 5; i++) {
            int type = i;
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == type) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                typeWithMaxAmount = i;
            }
        }
        return typeWithMaxAmount;
    }
}
