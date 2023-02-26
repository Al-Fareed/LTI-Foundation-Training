/*
 * Write a program to get a 3x3 matrix and display a matrix of order 4x4, with fourth row and column as sum of rows and columns respectively.
[Note: First find the sum for rows then the column.]
Input Format:
Input consists of elements in the 3x3 matrix.
Output Format:
Print the obtained 4x4 matrix.
Sample Input and Output:
Enter the 3x3 matrix
1 2 3 1 2 3 1 2 3
The sum matrix is
1 2 3 6 
1 2 3 6 
1 2 3 6 
3 6 9 18 
 */
package Design;
import java.util.*;
public class ThreeToFourDimensionMat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix");
        int[][] matrix=new int[9][9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j]=sc.nextInt();
            }  
        }int ctotal=0;
        System.out.println("The sum matrix is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            int total=0;
                for (int j = 0; j < 3; j++)
                {
                    total=total+matrix[i][j];
                }
                ctotal=ctotal+total;
                System.out.print(total+"");
                System.out.println();
                
        }
        for (int i = 0; i < 3; i++) {
            int colSum=0;
                for (int j = 0; j < 3; j++)
                {
                    colSum=matrix[j][i]+colSum;
                }
                System.out.print(colSum+" ");
                colSum=0;
        }
        System.out.println(ctotal+" ");
    }
}
