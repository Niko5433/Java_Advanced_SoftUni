package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
        int binaryNumber = 0;

        if (number < 0) {
            System.out.println("Cannot handle negative integers");
            return;
        }
        if (number == 0){
            System.out.print(0);
            return;
        }

        while (number > 0) {
            binaryStack.push(number % 2);
            number /= 2;
        }
        while (!binaryStack.isEmpty()){
            System.out.print(binaryStack.pop());
        }
    }
}
