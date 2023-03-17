/*
 * Write a program to print the given pattern.

Input Format:

Input consists of a single integer.

Output Format:

Refer sample outputs. There is a trailing space at the end of each line.

 

Sample Input:

5

Sample Output:

5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */

import java.util.*;
public class Pattern1_Reverse {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                int j=n+1;
                for(j=(j-i);j>0;){
                    System.out.print(j+" ");
                    j=j-1;
                }
                System.out.println();
            }
        }
    }
}
