/*Matrix Addition

    Write a program to perform matrix addition. Assume only square matrices of the same dimension.

Input Format:

   The input consists of (2*(m*m)+1) integers. The first integer corresponds to m, the number of rows / columns in the matrix . The next m*m integers correspond to the elements in the first matrix. The last m*m elements correspond to the elements in the second matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m is 10.


Output Format:

   Refer sample output for details.

Sample Input and Output :

[ All text of bold corresponds to input ]

2

4 5

6 9

1 2

3 4

5 7

9 13 */
package Analyze;

              
import java.util.Scanner;  
               
public class SumOf2matrix{  
 public static void main(String argv[])  
 {  
 int i,j,n;  
int[][] in1 = new int[10][10];  
 int[][] in2 = new int[10][10];  
 int[][] in3 = new int[10][10];  
 Scanner sc=new Scanner(System.in);  
 n=sc.nextInt();  
for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
        in1[i][j]=sc.nextInt();  
}  
System.out.println("Entered array 1");
for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
        System.out.print(in1[i][j]+" ");
} 

 for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
      in2[i][j]=sc.nextInt();  
 } 
 System.out.println("Entered array 2");
for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
        System.out.print(in2[i][j]+" ");
}  
 for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
    in3[i][j]=  in2[i][j]+in1[i][j];
 }  
 System.out.println("Entered array 3");
for(i=0;i<n;i++)  
 {  
    for(j=0;j<n;j++)  
        System.out.print(in3[i][j]+" ");
} 
 for(i=0;i<n;i++)  
 {  
 for(j=0;j<n;j++)  
    System.out.print(in3[i][j]+" ");  
 System.out.println();  
 }  
 }  
} 