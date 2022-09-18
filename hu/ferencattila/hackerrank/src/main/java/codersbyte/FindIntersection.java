package codersbyte;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

    public static String findIntersection(String[] strArr) {
        String[] firstNumbers = strArr[0].split(", ");
        String[] secondNumbers = strArr[1].split(", ");
        List<String> result = new ArrayList<>();
        for (String str : firstNumbers) {
            int i = 0;
            do {
                if (str.equals(secondNumbers[i])) {
                    result.add(str);
                }
                i++;
            } while ((i < secondNumbers.length) && (Integer.parseInt(str) >= Integer.parseInt(secondNumbers[i])));
        }
        if (result.isEmpty()) {
            return "false";
        } else {
            return result.toString().replace("[", "").replace("]", "").replace(" ", "");
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(findIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        System.out.println(findIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
    }
}
