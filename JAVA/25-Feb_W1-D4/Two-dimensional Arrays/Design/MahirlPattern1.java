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

5 4 3 2 1

10 9 8 7 6

15 14 13 12 11

20 19 18 17 16

25 24 23 22 21

 

14

 

Sample Input 2 :

6

4

5

 

Sample Output 2:

6 5 4 3 2 1

12 11 10 9 8 7

18 17 16 15 14 13

24 23 22 21 20 19

30 29 28 27 26 25

36 35 34 33 32 31

 

20

 
 */
package Design;
import java.util.*;
public class MahirlPattern1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int k=1;
        int arr[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = (n-1); j>=0; j--) {
                arr[i][j]=k;
               k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n"+arr[row-1][col-1]);
    sc.close();
    }
}
