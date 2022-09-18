package hackerrank.prepare.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {


    private static int B;
    private static int H;
    private static boolean flag;

    static {

        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        scanner.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
