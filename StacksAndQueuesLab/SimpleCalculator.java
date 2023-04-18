package StacksAndQueuesLab;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputParts = input.split(" ");
        List<String> inputList = Arrays.asList(inputParts);
        Collections.reverse(inputList);

        ArrayDeque<String> inputStack = new ArrayDeque<>();
        for (String part : inputList) {
            inputStack.push(part);
        }

        int result = 0;
        while (inputStack.size() > 1){
            int firstNum = Integer.parseInt(inputStack.pop());
            String operation = inputStack.pop();
            int secondNum = Integer.parseInt(inputStack.pop());

            switch (operation){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                default:
                    System.out.println("Unknown operation " + operation);
                    return;
            }
            inputStack.push("" + result);
        }

        System.out.println(inputStack.peek());
    }
}
