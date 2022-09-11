package contests.projecteuler;

public class MultiplesOfThreeAndFive {

    public static long summarizeMultiples(long max) {
        int[] add = {3, 5, 6, 9, 10, 12, 15};
        long j = max / 15;
        long k = ((j - 1) * j) / 2;
        long sum = (k * 15 * add.length) + (j * 60);
        for (int i : add) {
            long value = j * 15 + i;
            if (value < max) {
                sum += value;
            }
        }
        if (max % 15 == 0) {
            return (sum - max);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + ": " + summarizeMultiples(i));
        }
    }
}
