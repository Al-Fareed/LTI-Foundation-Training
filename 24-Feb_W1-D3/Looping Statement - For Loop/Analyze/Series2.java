package Analyze;
/*
 * Write a program to generate the first n terms in the series ---2,6,12,20,30,42,56,...

Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of the terms in the series separated by a blank space.

Sample Input:

8

Sample Output:

2 6 12 20 30 42 56 72
 */
import java.util.*; 
class Main{ 
  public static void main(String[] args) 
  { 
    try (Scanner in = new Scanner(System.in)) {
        int input=in.nextInt(); 
        for(int 
          i=1
;
i<=input
;i++) 
        { 
          System.out.print(i*i+i + " "); 
        }
    } 
  } 
} 

