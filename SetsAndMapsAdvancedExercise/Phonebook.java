package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine();
        }
        String searchNames = scanner.nextLine();
        while (!searchNames.equals("stop")) {
            if (phoneBook.containsKey(searchNames)) {
                System.out.printf("%s -> %s%n", searchNames, phoneBook.get(searchNames));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchNames);
            }
            searchNames = scanner.nextLine();
        }
    }
}
