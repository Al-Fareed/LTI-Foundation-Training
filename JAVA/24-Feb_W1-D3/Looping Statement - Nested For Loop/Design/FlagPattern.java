/*
 * Write a program to generate the Italy country flag pattern. In Italy flag, 
Green color should be represented by “(” symbol. 
White color should be represented by “#” symbol.
Red color should be represented by “)” symbol.

Input and Output Format:
 
Input consists of a single integer, n. Assume that “n>=4” and should be an even number.
The width to length ratio of the flag is 2:3.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
 
4
 
Sample Output 1:
 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
 
Sample Input 2:
 
18
 
Sample Output 2:
 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) )
 
 */
import java.util.*;
public class FlagPattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
            int n=sc.nextInt();
            int count = n/2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print("( ");
                }
                for (int k = 0; k < count; k++) {
                    System.out.print("# ");
                }
                for (int m = 0; m < count; m++) {
                    System.out.print(") ");
                }
                System.out.println();
            }
        }
    }
}
