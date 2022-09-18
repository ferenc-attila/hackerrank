package hackerrank.prepare.algorithms.implementation;

import java.util.List;

public class BillDivision {

    public void bonAppetit(List<Integer> bill, int k, int b) {
        int amountOfAnna = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k))/2;
        if (b <= amountOfAnna) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - amountOfAnna);
        }
    }
}
