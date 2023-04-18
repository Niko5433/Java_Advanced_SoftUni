package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isFirstLetterCapital = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> printCapitalWords = str -> System.out.println(str);

        List<String> capitalCases = Arrays.stream(scanner.nextLine().split(" "))
                .filter(x -> isFirstLetterCapital.test(x)).collect(Collectors.toList());

        System.out.println(capitalCases.size());

        capitalCases.forEach(elem -> printCapitalWords.accept(elem));

    }
}
