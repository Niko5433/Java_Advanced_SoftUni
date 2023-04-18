package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        String[] integers = numbers.split(" ");
        ArrayDeque<String> integerStack = new ArrayDeque<>();

        for (String num: integers) {
            integerStack.push(num);
        }
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop() + " ");
        }


    }
}
