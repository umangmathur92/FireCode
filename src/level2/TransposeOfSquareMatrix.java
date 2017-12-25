package level2;

import java.util.Arrays;

public class TransposeOfSquareMatrix {

    public static void main(String[] args) {
        int[][] inputMatrix = new int[][]{
                {1, 0, 1},
                {1, 0, 1},
                {1, 0, 1}
        };
        int[][] transposedMatrix = transposeMatrix(inputMatrix);
        System.out.println(Arrays.deepToString(transposedMatrix));
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCol = matrix[0].length;
        for (int i=0; i<numRows; i++) {
            for (int j=i; j<numCol; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

}
