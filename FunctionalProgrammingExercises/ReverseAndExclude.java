package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n =Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbersList);

        Predicate<Integer> isDivisible = elem -> elem % n == 0;

        numbersList.removeIf(isDivisible);

        numbersList.forEach(elem -> System.out.print(elem + " "));


    }
}
