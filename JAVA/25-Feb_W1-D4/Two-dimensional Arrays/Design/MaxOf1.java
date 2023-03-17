/*
 * ROW WITH MAXIMUM NUMBER OF 1’s
Write a program to find the row with  maximum number of 1s in a given boolean 2D array.

Input Format:
The first line of the input consists of an integer, r that corresponds to the number of rows in the matrix.
The next line of the input consists of an integer, c that corresponds to the number of columns in the matrix.
The next 'm*n' lines in the input corresponds to the elements in the matrix.

Note: Row always starts from “0”.

Output Format:
Output is an integer value , which represents row number with maximum number of 1’s.
Refer sample input and output for formatting details.

Sample Input1:
4
4
1 0 0 0
0 0 1 1
1 1 1 0
1 0 0 0
Sample Output1:
2
 */
package Design;
import java.util.*;
public class MaxOf1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int rsum[]=new int[6];
        int a[][]=new int[r][c];
        int temp[]=new int[6];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            int total=0;
            for (int j = 0; j < c; j++) {
                total=total+a[i][j];
            }
            rsum[i]=total;
            temp[i]=total;
        }
        Arrays.sort(temp);
        int max=temp[5];
        int count=0;
        for (int i : rsum) {
            if(i==max){
                System.out.println(count);
                break;
            }
            else{
                count++;
            }
        }
        
    }
}
