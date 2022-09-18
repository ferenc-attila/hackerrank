package hackerrank.contests.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenFibonacci {

    private static long getFibonacciEvenSum (long n) {
        List<Long> numbers = createFibonacciRow(n);
        System.out.println(numbers);
        return numbers.stream()
                .filter(value -> value % 2 == 0)
                .mapToLong(Long::longValue)
                .sum();
    }

    private static List<Long> createFibonacciRow(long n) {
        List<Long> result = new ArrayList<>(Arrays.asList(1L, 2L));
        long current = 1L;
        long next = 2L;
        while (next + current < n) {
            next = next + current;
            current = next - current;
            result.add(next);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciEvenSum(10));
        System.out.println(getFibonacciEvenSum(100));
    }
}
