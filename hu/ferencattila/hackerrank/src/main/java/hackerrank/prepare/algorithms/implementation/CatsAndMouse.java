package hackerrank.prepare.algorithms.implementation;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int value = Math.abs(x - z) - Math.abs(y - z);
        if (value < 0) {
            return "Cat A";
        }
        if (value > 0) {
            return "Cat B";
        }
        return "Mouse C";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(1,3,2));
    }
}
