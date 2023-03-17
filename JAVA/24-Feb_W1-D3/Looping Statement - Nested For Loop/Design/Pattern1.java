/*
 * Write a program to print the given pattern.

 

Input Format:

Input consists of a single integer.

 

Output Format:

Refer sample outputs. There is a trailing space at the end of each line.

 

Sample Input:

5

 

Sample Output:
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */
import java.util.*;
class Pattern1
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = (i+1); j <=n; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}