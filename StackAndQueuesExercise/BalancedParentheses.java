package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean areBalanced = false;
        ArrayDeque<Character> symbolStack = new ArrayDeque<>();
        //{[(
        for (char bracket: input.toCharArray()) {
            if (bracket == '{' || bracket == '[' || bracket == '('){
                symbolStack.push(bracket);
            } else if (bracket == '}' || bracket == ']' || bracket == ')'){
                if (symbolStack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char openBracket = symbolStack.pop();
                if (openBracket == '{' && bracket == '}'){
                    areBalanced = true;
                } else if (openBracket == '[' && bracket == ']'){
                    areBalanced = true;
                } else if (openBracket == '(' && bracket == ')'){
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
