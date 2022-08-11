package prepare.algorithms.warmup;

public class TimeConversion {

    public String timeConversion(String s) {
        StringBuilder result = new StringBuilder(s.substring(0, s.length() - 2));
        int hours = Integer.parseInt(s.substring(0, 2));
        if (s.endsWith("AM") && hours >= 12) {
            hours -= 12;
            String hourString = Integer.toString(hours);
            if (hours == 0) {
                hourString = "00";
            }
            result.replace(0, 2, hourString);
        }
        if (s.endsWith("PM") && hours <= 11) {
            hours += 12;
            String hourString = Integer.toString(hours);
            result.replace(0, 2, hourString);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "07:00:01PM";
        System.out.println(new TimeConversion().timeConversion(s));
    }
}
