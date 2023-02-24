/*
 * Write a program to generate a pattern of stars.


Input and Output Format:

Input consists of a single integer that corresponds to n, the number of rows.

Refer sample input and output for formatting specifications.


[All text in bold corresponds to input and the rest corresponds to the output.]

Sample Input and Output 1:

5

*

**

***

****

*****
Sample Input and Output 2:

3

*

**

***
 */
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n =sc.nextInt();
            for (int i = 0; i <=n; i++) {
                for (int j = i; j >0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
