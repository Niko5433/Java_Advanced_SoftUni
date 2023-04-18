package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix);

        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int startNumber = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            if ((cols + 1) % 2 != 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols] = startNumber;
                    startNumber++;
                }
            } else {
                for (int rows = matrix.length - 1; rows >= 0; rows--) {
                    matrix[rows][cols] = startNumber;
                    startNumber++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int startNumber = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = startNumber;
                startNumber++;
            }
        }
    }
}
