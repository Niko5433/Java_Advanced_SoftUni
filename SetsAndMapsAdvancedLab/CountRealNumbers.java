package SetsAndMapsAdvancedLab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        for (String number: input) {
            double currentNum = Double.parseDouble(number);
            numbers.putIfAbsent(currentNum, 0);
            numbers.put(currentNum, numbers.get(currentNum) + 1);
        }
        for (Double currentNum: numbers.keySet()) {
            System.out.printf("%.1f -> %d%n", currentNum, numbers.get(currentNum));
        }

    }
}
