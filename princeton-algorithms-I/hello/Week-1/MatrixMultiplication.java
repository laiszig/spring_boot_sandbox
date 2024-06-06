public class MatrixMultiplication {

    public static void main(String[] args) {
        // Example matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Multiply matrices
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Print the result
        if (result != null) {
            for (int[] row : result) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int p = matrixB[0].length;

        // Check if multiplication is possible
        if (matrixB.length != n) {
            throw new IllegalArgumentException("Number of columns in Matrix A must be equal to the number of rows in Matrix B.");
        }

        // Initialize the result matrix
        int[][] result = new int[m][p];

        // Multiply matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}
