package prepare.algorithms.implementation;

public class DrawingBooks {

    public static int pageCount(int n, int p) {
        int forward = p / 2;
        int backward = n % 2 != 0 ? (n - p) / 2 : (n - p + 1) / 2;
        return Math.min(forward, backward);
    }

    public static void main(String[] args) {
        int firstN = 5;
        int firstP = 3;
        int secondN = 6;
        int secondP = 2;
        int thirdN = 5;
        int thirdP = 4;
        int fourthN = 6;
        int fourthP = 5;
        System.out.println(pageCount(firstN, firstP));
        System.out.println(pageCount(secondN, secondP));
        System.out.println(pageCount(thirdN, thirdP));
        System.out.println(pageCount(fourthN, fourthP));
    }
}
