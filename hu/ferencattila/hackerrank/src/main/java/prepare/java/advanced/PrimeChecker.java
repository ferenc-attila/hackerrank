package prepare.java.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
        }
        Prime prime = new Prime();
        prime.checkPrime(input);
    }

    private static class Prime {

        public void checkPrime(List<Integer> numbers) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                if (isPrime(numbers.get(i))) {
                    result.add(numbers.get(i));
                    System.out.println(createString(result));
                } else if (numbers.get(i) % 2 == 1){
                    System.out.println(createString(result));
                }
            }
            if (result.isEmpty()) {
                System.out.println();
            }
        }

        private String createString(List<Integer> result) {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (int number : result) {
                if (first) {
                    sb.append(number);
                    first = false;
                } else {
                    sb.append(" ").append(number);
                }
            }
            return sb.toString();
        }

        private boolean isPrime(int number) {
            if (Math.abs(number) <= 1) {
                return false;
            }
            if (Math.abs(number) <= 3) {
                return true;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
