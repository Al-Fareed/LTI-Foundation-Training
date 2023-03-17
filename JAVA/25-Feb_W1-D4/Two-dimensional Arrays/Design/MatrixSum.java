/*
 * Write a  program to find the sum of the elements in the matrix.
Input Format:
The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.
Output Format:
Refer sample output for details.
Sample Input 1:
3
2
4 5
6 9
0 3
Sample Output 1:
The sum of the elements in the matrix is 27
 */
package Design;

import java.util.*;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
            int[][] matrix=new int[10][10];
            m=sc.nextInt();
            n=sc.nextInt();
            int total=0;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }  
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    total=total+matrix[i][j];
                }
            }
            System.out.println("The sum of the elements in the matrix is "+total);
    }
}
