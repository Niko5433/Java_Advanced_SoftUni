package RegularExam;

import java.util.*;

public class ApocalypsePreparation {
    private static final int PATCH_VALUE = 30;
    private static final int BANDAGE_VALUE = 40;
    private static final int MEDKIT_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTextiles = scanner.nextLine().split("\\s+");


        Deque<Integer> textilesSequence = new ArrayDeque<>();
        for (String textile : inputTextiles) {
            textilesSequence.offer(Integer.parseInt(textile));
        }

        String[] inputMedicaments = scanner.nextLine().split("\\s+");

        Deque<Integer> medicamentsSequence = new ArrayDeque<>();
        for (String medicament : inputMedicaments) {
            medicamentsSequence.push(Integer.parseInt(medicament));
        }

        int patchCount = 0, bandageCount = 0, medkitCount = 0;

        while (!textilesSequence.isEmpty() && !medicamentsSequence.isEmpty()) {
            int textile = textilesSequence.poll();
            int medicament = medicamentsSequence.pop();
            int possibleMedicament = textile + medicament;

            if (possibleMedicament == PATCH_VALUE) {
                patchCount++;
            } else if (possibleMedicament == BANDAGE_VALUE) {
                bandageCount++;
            } else if (possibleMedicament == MEDKIT_VALUE) {
                medkitCount++;
            } else if (possibleMedicament > MEDKIT_VALUE) {
                medkitCount++;
                int difference = possibleMedicament - MEDKIT_VALUE;
                medicamentsSequence.push(medicamentsSequence.pop() + difference);
            } else {
                medicamentsSequence.push(medicament + 10);
            }
        }
        if (textilesSequence.isEmpty() && medicamentsSequence.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textilesSequence.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        Map<String, Integer> medicamentsMap = new HashMap<>();
        medicamentsMap.put("Patch", patchCount);
        medicamentsMap.put("Bandage", bandageCount);
        medicamentsMap.put("MedKit", medkitCount);

        medicamentsMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    if (entry.getValue() != 0) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                });
        if (!textilesSequence.isEmpty()) {
            System.out.print("Textiles left: ");
            while (!textilesSequence.isEmpty()) {
                if (textilesSequence.size() > 1) {
                    System.out.print(textilesSequence.poll() + ", ");
                } else {
                    System.out.print(textilesSequence.poll());
                }

            }
        }

        if (!medicamentsSequence.isEmpty()) {
            System.out.print("Medicaments left: ");
            while (!medicamentsSequence.isEmpty()) {
                if (medicamentsSequence.size() > 1) {
                    System.out.print(medicamentsSequence.pop() + ", ");
                } else {
                    System.out.print(medicamentsSequence.pop());
                }
            }
        }
    }
}