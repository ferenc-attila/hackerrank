package prepare.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {

    private static class MyRegex {

        private String pattern = "^(((25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})\\.){3})(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})$";
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }
        List<String> list = new ArrayList<>();

        list.add("256.12.12.034");
        list.add("121.234.12.12");
        list.add("23.45.12.56");
        list.add("00.12.123.123123.123");
        list.add("122.123");
        list.add("Hello.IP");

        for (String IP : list) {
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
