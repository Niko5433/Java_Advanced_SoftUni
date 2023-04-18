package SetsAndMapsAdvancedLab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] nameGrades = scanner.nextLine().split("\\s+");
            String name = nameGrades[0];
            Double grade = Double.parseDouble(nameGrades[1]);

            studentGrades.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
            // studentGrades.putIfAbsent(name, new ArrayList<>());
            // studentGrades.get(name).add(grade)
        }
        studentGrades.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(innerEntry -> System.out.printf("%.2f ", innerEntry));
            System.out.printf("(avg: %.2f)%n", entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble());
        });
    }
}