package MultidimensionalArraysLab;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] firstMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        rowsAndCols = scanner.nextLine().split("\\s+");
        int secondRows = Integer.parseInt((rowsAndCols[0]));
        int secondCols = Integer.parseInt((rowsAndCols[1]));
        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            for (int j = 0; j < secondCols; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        if (rows != secondRows || cols != secondCols){
            System.out.println("not equal");
            return;
        }
        boolean isEquals = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    isEquals = false;
                    break;
                }
            }
        }
        if (isEquals){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

}
