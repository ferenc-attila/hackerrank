package hackerrank.prepare.algorithms.warmup;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        arr.remove(0);
        int sumOfLeftToRightDiagonal = 0;
        int sumOfRightToLeftDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumOfLeftToRightDiagonal += arr.get(i).get(i);
            sumOfRightToLeftDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(sumOfLeftToRightDiagonal - sumOfRightToLeftDiagonal);
    }

    public static void main(String[] args) {
        List<Integer> secondList = List.of(6, 8);
        List<Integer> thirdList = List.of(-6, 9);
//        List<Integer> fourthList = List.of(9,10,11,12);
//        List<Integer> fifthList = List.of(13,14,15,16);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(secondList);
        arr.add(thirdList);
//        arr.add(fourthList);
//        arr.add(fifthList);

        System.out.println(new DiagonalDifference().diagonalDifference(arr));
    }
}
