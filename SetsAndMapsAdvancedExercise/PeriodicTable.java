package SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> elements = new TreeSet<>();

        while (--n >= 0) {
            String[] compound = scanner.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(compound));
        }
        elements.forEach(el -> System.out.print(el + " "));
    }
}
