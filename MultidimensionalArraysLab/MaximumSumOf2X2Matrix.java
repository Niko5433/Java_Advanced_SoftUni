package MultidimensionalArraysLab;

import java.util.Scanner;

public class MaximumSumOf2X2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(data[j]);
            }
        }
        int topLefRow = -1;
        int topLefCol = -1;

        int maxSum = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix [i + 1][j] + matrix [i+1][j+1];

                if (currentSum > maxSum){
                    maxSum = currentSum;
                    topLefRow = i;
                    topLefCol = j;

                }
            }
        }
        System.out.println(matrix[topLefRow][topLefCol] + " " + matrix[topLefRow][topLefCol + 1]);
        System.out.println(matrix[topLefRow + 1][topLefCol] + " " + matrix[topLefRow + 1][topLefCol + 1]);
        System.out.println(maxSum);
    }
}
