package ExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int dimensionX = dimensions[0];
        int dimensionY = dimensions[1];

        char[][] field = new char[dimensions[0]][dimensions[1]];

        for (int i = 0; i < field.length; i++) {
            char[] row = scanner.nextLine().replace(" ", "").toCharArray();
            field[i] = row;
        }

        //player position
        int playerX = 0;
        int playerY = 0;
        //treasure position
        int treasureX = 0;
        int treasureY = 0;

        for (int i = 0; i < field.length; i++) {
            char[] chars = field[i];
            for (int j = 0; j < chars.length; j++) {
                char ch = chars[j];
                if (ch == 'Y') {
                    playerX = i;
                    playerY = j;
                } else if (ch == 'X') {
                    treasureX = i;
                    treasureY = j;
                }
            }
        }
        List<String> commandsList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            switch (command) {
                case "up":
                    if (playerX > 0) {
                        char pos = field[--playerX][playerY];
                        if (pos == 'T') {
                            playerX++;
                        } else {
                            commandsList.add(command);
                        }
                    }
                    break;
                case "down":
                    if (playerX < field.length - 1) {
                        char pos = field[++playerX][playerY];
                        if (pos == 'T') {
                            playerX--;
                        } else {
                            commandsList.add(command);
                        }
                    }
                    break;
                case "left":
                    if (playerY > 0) {
                        char pos = field[playerX][--playerY];
                        if (pos == 'T') {
                            playerY++;
                        } else {
                            commandsList.add(command);
                        }
                    }

                    break;
                case "right":
                    if (playerY < dimensionY - 1) {
                        char pos = field[playerX][++playerY];
                        if (pos == 'T') {
                            playerY--;
                        } else {
                            commandsList.add(command);
                        }
                    }
                    break;

            }
            command = scanner.nextLine();
        }

        if (playerX == treasureX && playerY == treasureY) {
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            String path = String.join(", ", commandsList);
            System.out.print(path);
        } else {
            System.out.println("The map is fake!");
        }

    }
}
