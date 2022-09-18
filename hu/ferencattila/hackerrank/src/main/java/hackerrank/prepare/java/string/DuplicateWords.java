package hackerrank.prepare.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int numberOfStrings = scanner.nextInt();
//        scanner.nextLine();

        List<String> inputs = new ArrayList<>(Arrays.asList(
                "Goodbye bye bye world world world",
                "Sam went went to to to his business",
                "Reya is is the the best player in eye eye game",
                "in inthe",
                "Hello hello Ab aB"));

//        for (int i = 0; i < numberOfStrings; i++) {
//            inputs.add(scanner.nextLine());
//        }

        List<String> results = inputs.stream().map(DuplicateWords::removeDuplicateWords)
                .collect(Collectors.toList());

        System.out.println(results);
    }

    private static String removeDuplicateWords(String sentence) {
        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
           sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
        }
        return sentence;
    }
}
