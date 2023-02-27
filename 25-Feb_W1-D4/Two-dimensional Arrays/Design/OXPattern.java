/*
 * Alternating Rectangles with 0 and X
Write a code, which inputs two numbers m and n. Create a matrix of size m x n (m rows and n columns) in which every elements is either X or 0.
The Xs and 0s must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of 0s, then a rectangle of Xs, and so on.
Note: m and n should be greater than 2.
Input Format:
The first line of the input consists of an integer, m that corresponds to the number of rows in the input array.
The next line of the input consists of an integer, n that corresponds to the number of columns in the input array.
Output Format:
Output is a matrix with alternate rectangle with 0 and X.
Refer sample input and output for formatting details.
Sample Input1:
3
3
Sample Output1:
X X X
X 0 X
X X X 
Sample Input2:
4
5
Sample Output2:
X X X X X
X 0 0 0 X
X 0 0 0 X
X X X X X

Sample Input3:
5
5

Sample Output3:

X X X X X 
X 0 0 0 X 
X 0 X 0 X 
X 0 0 0 X 
X X X X X
 */
package Design;
import java.util.*;

public class OXPattern {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    // if (m <= 2 || n <= 2) {
    //     System.out.println("Error: m and n must be greater than 2.");
    //     return;
    // }

    char[][] matrix = new char[m][n];
    int startX = 0, endX = n - 1, startY = 0, endY = m - 1;
    char value = 'X';

    while (startX <= endX && startY <= endY) {
        // fill top row
        for (int i = startX; i <= endX; i++) {
            matrix[startY][i] = value;
        }
        startY++;

        // fill right column
        for (int i = startY; i <= endY; i++) {
            matrix[i][endX] = value;
        }
        endX--;

        // fill bottom row
        if (startY <= endY) {
            for (int i = endX; i >= startX; i--) {
                matrix[endY][i] = value;
            }
            endY--;
        }

        // fill left column
        if (startX <= endX) {
            for (int i = endY; i >= startY; i--) {
                matrix[i][startX] = value;
            }
            startX++;
        }

        // alternate value between X and 0
        value = (value == 'X') ? '0' : 'X';
    }

    // print the matrix
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    }
}
