package Design;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a program to find the minimum element in the 2D matrix.
Input Format:
The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix, and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, the first row first, then second row, and so on. Assume that the maximum value of m and n is 10.
Output Format:
Refer to sample output for details.
Sample Input :
3
2
4 5
6 9
0 3
Sample Output :
The minimum element is 0
 */
public class MinOfEachRow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int m,n,i,j,max;
            int[][] matrix=new int[10][10];
            m=sc.nextInt();
            n=sc.nextInt();
            int totSize=m*n;
            int[] sol = new int[m*n];
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }  
            }
            int l=0;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    sol[l]=matrix[i][j];
                    l++;
                }
            }
            Arrays.sort(sol);
            System.out.println("The minimum element is "+sol[0]);
        sc.close();
        }
}
