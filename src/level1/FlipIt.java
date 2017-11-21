package level1;

import java.util.Arrays;

public class FlipIt {

    public static void main(String[] args) {
        int matrix[][] = new int[][] {
                {1, 2, 3, 4 , 5},
                {6, 7, 8, 9, 10}/*,
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}*/
        };
        int[][] flippedMatrix = flipItVerticalAxis(matrix);
        System.out.println(Arrays.deepToString(flippedMatrix));
    }

    public static int[][] flipItVerticalAxis(int[][] matrix) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        for (int i=0; i<numRows; i++) {
            for (int j=0; j<numColumns/2; j++) {
                int column = numColumns - 1 - j;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][column];
                matrix[i][column] = temp;
            }
        }
        return matrix;
    }
}
