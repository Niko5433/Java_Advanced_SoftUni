package StackAndQueuesExercise;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.equals("2")){
                numbersStack.pop();
            } else if (command.equals("3")){
                if (numbersStack.size() > 0) {
                    System.out.println(Collections.max(numbersStack));
                }
            } else {
                int x = Integer.parseInt(command.split("\\s+")[1]);
                numbersStack.push(x);
            }
        }
    }
}
