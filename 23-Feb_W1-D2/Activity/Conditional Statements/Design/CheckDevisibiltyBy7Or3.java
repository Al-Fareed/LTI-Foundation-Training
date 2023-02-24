/*
 * Write a program to find whether a given number is divisible by both 7 and 3.

Input Format:

Input consists of a single integer.

Output Format:

Output consists of a single line. Refer sample output for the format.

Sample Input 1:

21

Sample Output 1 :

21 is divisible by both 7 and 3

Sample Input 2:

18

Sample Output 2:

18 is not divisible by both 7 and 3

 
 */
import java.util.Scanner;
class CheckDevisibiltyBy7Or3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            
            if((n%3)==0)
            {
                if((n%7)==0)
                {
                    System.out.println(n+"  is divisible by both 7 and 3");
                }
                else
                {
                   System.out.println(n+"  is not divisible by both 7 and 3");
                }
            }
            else{
                System.out.println(n+"  is not divisible by both 7 and 3");
            }
        }
        
        }
     }
