/*
 * Write a program to generate the flag pattern given in the sample output. 
 
Input and Output Format:
Input consists of a single integer, n. Assume that “n” should be an odd number.
The number of rows and columns is equal.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
3
Sample Output 1:
 
~ ~ ~ 
~ * ~ 
~ ~ ~
 
Sample Input 2:
7
Sample Output 2:
 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ *  ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
 
 */
import java.util.*;
public class tildePattern {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int q1=1,q2,q3=n;
            q2 = (q3-q1)/2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==q2)
                    {
                        if(j==q2)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("~ ");
                        }
                    }
                    else
                    {
                        System.out.print("~ ");
                    }
                }
                System.out.println();
            }
        }
    }
}
