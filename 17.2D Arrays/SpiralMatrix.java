import java.util.*;

public class SpiralMatrix {
    public static void PrintSpiral(int matrix[][]) {
        if (matrix == null || matrix.length == 0) {
            return; // Handle edge case where the matrix is null or empty
        }

        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        List<Integer> spiralOrder = new ArrayList<>();

        while (StartRow <= EndRow && StartCol <= EndCol) {
            // top
            for (int l = StartCol; l <= EndCol; l++) {
                spiralOrder.add(matrix[StartRow][l]);
            }
            StartRow++;

            // right
            for (int i = StartRow; i <= EndRow; i++) {
                spiralOrder.add(matrix[i][EndCol]);
            }
            EndCol--;

            // bottom
            if (StartRow <= EndRow) {
                for (int k = EndCol; k >= StartCol; k--) {
                    spiralOrder.add(matrix[EndRow][k]);
                }
                EndRow--;
            }

            // left
            if (StartCol <= EndCol) {
                for (int j = EndRow; j >= StartRow; j--) {
                    spiralOrder.add(matrix[j][StartCol]);
                }
                StartCol++;
            }
        }

        // Print the result in matrix form
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(spiralOrder.get(index++) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix1[][] = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 }, 
            { 13, 14, 15, 16 } 
        };

        System.out.println("Spiral order of matrix1:");
        PrintSpiral(matrix1);
    }
}
