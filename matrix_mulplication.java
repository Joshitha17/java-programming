import java.util.Scanner;

public class matrix_mulplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the matrices
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix / rows for second matrix: ");
        int cols1 = sc.nextInt(); // Also the number of rows for second matrix

        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2]; // rows of second matrix = cols of first
        int[][] resultMatrix = new int[rows1][cols2];

        // Input elements for first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < cols1; i++) { // rows of second matrix = cols1
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}