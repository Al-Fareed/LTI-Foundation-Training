package Analyze;

/*
 * Write a program to generate the first n terms in the series --- 3,9,27,81,...,...


Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of the terms in the series separated by a blank space.

Sample Input:

6

Sample Output:

3 9 27 81 243 729
 */

import java.util.*;
class Main
{
static int n, a = 3;
public static void main(String arg[])
{
try (Scanner s = new Scanner(System.in)) {
    n=s.nextInt();
}
for (int i=0;i<n;i++)
{
    System.out.print((a)+" ");
    a =a*3 ;

}
}
}