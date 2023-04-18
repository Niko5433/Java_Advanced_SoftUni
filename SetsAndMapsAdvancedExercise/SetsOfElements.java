package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> firstSetOfNumbers = new LinkedHashSet<>();
        Set<Integer> secondSetOfNumbers = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int currentNum = scanner.nextInt();
            firstSetOfNumbers.add(currentNum);
        }
        for (int i = 0; i < m; i++) {
            int currentNum = scanner.nextInt();
            secondSetOfNumbers.add(currentNum);
        }

        firstSetOfNumbers.retainAll(secondSetOfNumbers);
        firstSetOfNumbers.forEach(el -> System.out.print(el + " "));
    }
}
