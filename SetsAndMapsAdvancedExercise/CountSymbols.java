package SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        Map<String, Integer> textMap = new TreeMap<>();

        for (String symbol:input) {
            textMap.putIfAbsent(symbol, 0);
            textMap.put(symbol, textMap.get(symbol) + 1);
        }
        for (Map.Entry<String, Integer> entry : textMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }

    }
}
