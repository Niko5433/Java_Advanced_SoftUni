package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        //Function<List<Integer>, List<Integer>> addCommand = list -> list.stream().map(number -> number += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> add1 = list -> list.stream().map(number -> number += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = elem -> elem.stream().map(number -> number *= 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = elem -> elem.stream().map(number -> number -= 1).collect(Collectors.toList());
        //Consumer<List<Integer>> printCommand = list -> list.forEach(number -> System.out.print(number + " "));
        Consumer<List<Integer>> print = elem -> elem.forEach(number -> System.out.print(number + " "));

        String command = scanner.nextLine();

        while(!command.equals("end")){
            if(command.equals("add")){
                numbersList = add1.apply(numbersList);
            } else if (command.equals("multiply")){
                numbersList = multiply.apply(numbersList);
            } else if (command.equals("subtract")){
                numbersList = subtract.apply(numbersList);
            } else if (command.equals("print")){
                print.accept(numbersList);
                System.out.println();
            }

            command = scanner.nextLine();
        }

    }
}
