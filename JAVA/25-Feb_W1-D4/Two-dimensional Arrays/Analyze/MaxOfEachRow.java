/*
 * Maximum Element In Each Row

Write a program to find the maximum element in each row of the matrix.

 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order. Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input 1:

 

3

2

4 5

6 9

0 3

 

Sample Output 1:

 

5

9

3
 */
package Analyze;
import java.util.*;
public class MaxOfEachRow {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int m,n,i,j,max;
        int[][] matrix=new int[10][10];
        m=sc.nextInt();
        n=sc.nextInt();
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
            {
                matrix[i][j]=sc.nextInt();
            }  
        }
        System.out.println("Arrays enterd");
       for ( i = 0; i < m; i++) {
        for (j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]+" ");
            } 
            System.out.println();
       }
        for ( i = 0; i < m; i++) {
            max = matrix[i][0];
            for ( j = 1; j < n; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
            System.out.println(max);
        }
    sc.close();
    }
}
