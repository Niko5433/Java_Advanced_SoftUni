package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int i = 0; i < size; i++) {
            String[] columnData = scanner.nextLine().split("\\s+");

            int[] currentRow = Arrays.stream(columnData).mapToInt(elem -> Integer.parseInt(elem)).toArray();
            matrix[i] = currentRow;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int row = size - 1, col = 0; col < size ; row--, col++) {
            System.out.print(matrix[row][col] + " ");
        }
    }
}
