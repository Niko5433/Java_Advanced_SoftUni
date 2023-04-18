package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> names = name -> System.out.println("Sir " + name);

        Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList()).forEach(elem -> names.accept(elem));


    }
}
