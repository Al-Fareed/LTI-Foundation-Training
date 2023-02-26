package Design;
/*
 * Given a 2D array, write a program to print it in spiral form.

Input and Output Format:
The first line of the input consists of an integer, r that corresponds to the number of rows in the matrix.
The next line of the input consists of an integer, c that corresponds to the number of columns in the matrix.
The next 'm*n' lines in the input correspond to the elements in the matrix.
Output is a matrix.

Sample Input1:
4
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0, rowEnd = r - 1;
        int colStart = 0, colEnd = c - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Print the first row from the remaining rows
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;
            // Print the last column from the remaining columns
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;
            // Print the last row from the remaining rows
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }
            // Print the first column from the remaining columns
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
