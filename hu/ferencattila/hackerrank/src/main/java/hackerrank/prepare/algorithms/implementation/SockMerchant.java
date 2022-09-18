package hackerrank.prepare.algorithms.implementation;

import java.util.*;

public class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < ar.size(); i++) {
            if (!pairs.containsKey(ar.get(i))) {
                pairs.put(ar.get(i), 1);
            } else {
                pairs.put(ar.get(i), pairs.get(ar.get(i)) + 1);
            }
        }
        int numberOfPairs = 0;
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            numberOfPairs += entry.getValue() / 2;
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        List<Integer> anotherSample = new ArrayList<>(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
        System.out.println(sockMerchant(9, sample));
        System.out.println(sockMerchant(10, anotherSample));
    }
}
