package RegularExam;

import java.util.Scanner;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rowsInput = Integer.parseInt(input[0]);
        int colsInput = Integer.parseInt(input[1]);

        char[][] field = new char[rowsInput][colsInput];

        for (int i = 0; i < field.length; i++) {
            char[] row = scanner.nextLine().replace(" ", "").toCharArray();
            field[i] = row;
        }
        //B - player
        //O - furniture and obstacles
        //P - other players
        int playerX = 0;
        int playerY = 0;

        for (int i = 0; i < field.length; i++) {
            char[] chars = field[i];
            for (int j = 0; j < chars.length; j++) {
                char ch = chars[j];
                if (ch == 'B') {
                    playerX = i;
                    playerY = j;
                }
            }
        }

        int toucheOpponents = 0;
        int countMoves = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            if (toucheOpponents == 3) {
                break;
            }
            countMoves++;
            switch (command) {
                case "up":
                    if (playerX > 0) {
                        char pos = field[--playerX][playerY];
                        if (pos == 'O') {
                            playerX++;
                            countMoves--;
                        } else if (pos == 'P') {
                            toucheOpponents++;
                        }
                    } else {
                        countMoves--;
                    }
                    break;
                case "down":
                    if (playerX < field.length - 1) {
                        char pos = field[++playerX][playerY];
                        if (pos == 'O') {
                            playerX--;
                            countMoves--;
                        } else if (pos == 'P') {
                            toucheOpponents++;
                        }
                    } else {
                        countMoves--;
                    }
                    break;
                case "left":
                    if (playerY > 0) {
                        char pos = field[playerX][--playerY];
                        if (pos == 'O') {
                            playerY++;
                            countMoves--;
                        } else if (pos == 'P') {
                            toucheOpponents++;
                        }
                    } else {
                        countMoves--;
                    }
                    break;
                case "right":
                    if (playerY < colsInput - 1) {
                        char pos = field[playerX][++playerY];
                        if (pos == 'O') {
                            playerY--;
                            countMoves--;
                        } else if (pos == 'P') {
                            toucheOpponents++;
                        }
                    } else {
                        countMoves--;
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.print("Touched opponents: " + toucheOpponents);
        System.out.print(" Moves made: " + countMoves);
    }
}
