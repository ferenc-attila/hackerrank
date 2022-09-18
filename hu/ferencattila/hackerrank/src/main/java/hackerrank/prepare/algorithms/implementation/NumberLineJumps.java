package hackerrank.prepare.algorithms.implementation;

public class NumberLineJumps {

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;
        System.out.println(new NumberLineJumps().kangaroo(x1, v1, x2, v2));
    }

    private String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 < x2 && v1 < v2) {
            return "NO";
        }
        int i = 0;
        while (i * v1 + x1 < Integer.MAX_VALUE && i * v2 + x2 < Integer.MAX_VALUE) {
            if (i * v1 + x1 == i * v2 + x2) {
                return "YES";
            }
            i++;
        }
        return "NO";
    }
}
