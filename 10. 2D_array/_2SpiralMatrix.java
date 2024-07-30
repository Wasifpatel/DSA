import java.util.*;

public class _2SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return spiral;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right across the top row
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom down the right column
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left across the bottom row
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top up the left column
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiral;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10,11,12},
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
