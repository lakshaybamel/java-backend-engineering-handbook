public class MatrixDemo {
    public static void main(String[] args) {

        // 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Accessing element
        System.out.println("Element at [0][1]: " + matrix[0][1]);

        // Traversing using nested loops
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}