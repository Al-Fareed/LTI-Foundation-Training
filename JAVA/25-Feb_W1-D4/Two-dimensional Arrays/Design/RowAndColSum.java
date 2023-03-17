/*
 * Write a program to find row sum and column sum of a given matrix.
Input format :
Input consists of row size,r and columun size,c followed by r*c values.
Output Format :
Output consists of sum of each row and sum of  each column values in the input matrix.
[ Refer Sample Input and Output for further details ]
Sample Input and Output  :
[ All text of bold corresponds to Input and the rest output ]
Enter the row size
2
Enter the column size
2
Enter the matrix values
1
5
4
7
The matrix is
1 5
4 7
Row 1 sum is 6
Row 2 sum is 11
Column 1 sum is 5
Column 2 sum is 12


3
2
3
5
6
4
1
2

*/

package Design;

import java.util.*;

public class RowAndColSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the row size");
        m=sc.nextInt();
        System.out.println("Enter the column size");
        n=sc.nextInt();
        int[][] matrix=new int[m][n];
            
            System.out.println("Enter the matrix values");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }  
                
            }
            System.out.println("The matrix is");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }  
                System.out.println();
            }
            for (i = 0; i < m; i++) {
                int total=0;
                for (j = 0; j < n; j++)
                {
                    total=total+matrix[i][j];
                }
                System.out.println("Row "+(i+1)+" sum is "+total);
            }
            int colSum=0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++)
                {
                    colSum=matrix[j][i]+colSum;
                }
                System.out.println("Column "+(i+1)+" sum is "+colSum);
                colSum=0;
            }
        }   
}
