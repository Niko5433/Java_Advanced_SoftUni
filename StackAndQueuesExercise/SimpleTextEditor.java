package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> commandStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.startsWith("1")) {
                commandStack.push(currentText.toString());
                String textToAdd = input.split("\\s+")[1];
                currentText.append(textToAdd);
            } else if (input.startsWith("2")) {
                commandStack.push(currentText.toString());
                int count = Integer.parseInt(input.split("\\s+")[1]);;
                currentText.delete(currentText.length() - count,currentText.length());

            } else if (input.startsWith("3")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);;
                System.out.println(currentText.charAt(index - 1));

            } else if (input.equals("4")){
                if(!commandStack.isEmpty()){
                    String lastText = commandStack.pop();
                    currentText = new StringBuilder(lastText);
                }
            }
        }
    }
}
