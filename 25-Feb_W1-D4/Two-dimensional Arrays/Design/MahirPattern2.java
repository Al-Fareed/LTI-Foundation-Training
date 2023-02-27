/*
 * Can you please help Mahirl in generating a n*n matrix with values following the pattern shown in the sample output?
Input Format:
The first line of the input consists of a single integer that corresponds to n.
The second line of the input consists of an integer that corresponds to the row number of the element that needs to be printed.
The third line of the input consists of an integer that corresponds to the column number of the element that needs to be printed.
Assume that the row number and column number starts from 1.
Output Format :
Refer sample output. All values in a row are separated by a space. There is a trailing space at the end of each row.
Sample Input 1 :
5
3
2
Sample Output 1:
1 2 3 4 5

10 9 8 7 6

11 12 13 14 15

20 19 18 17 16

21 22 23 24 25

 

12

 

Sample Input 2 :

6

4

5


Sample Output 2:

1 2 3 4 5 6

12 11 10 9 8 7

13 14 15 16 17 18

24 23 22 21 20 19

25 26 27 28 29 30

36 35 34 33 32 31

 

20

 
 */
package Design;
import java.util.*;
public class MahirPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=(n+1);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=a;
                a++;
            }
            a=a+n;
        }
        for (int i = 1; i < n; i+=2) {
            for (int j = (n-1); j >=0; j--) {
                arr[i][j]=b;
                b++;
            }
            b=b+n;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n"+arr[row-1][col-1]);
        sc.close();
    }
}
