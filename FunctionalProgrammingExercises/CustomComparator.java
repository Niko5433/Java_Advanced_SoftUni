package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted((o1, o2) -> {
            if (o1 % 2 == 0 && o2 % 2 != 0) {
                return -1;
            } else if (o1 % 2 != 0 && o2 % 2 == 0) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        }).forEach(elem -> System.out.print(elem + " "));


    }
}
