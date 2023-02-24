/*
 * Write a program to reverse the digits of a number.

 

Input Format :

Input consists of a positive integer value.

Output Format :

The output consists of the reverse of the given number.

Refer to Sample Input and Output for further details.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output 1 :

Enter the number :
5642
Reverse of the number is 2465
 

Sample Input and Output 2 :

Enter the number :
1000
Reverse of the number is 1
 */
import java.util.*;
public class ReversingNum {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number :");
            int n=sc.nextInt();
            int rev=0,rem;
            while(n>0)
            {
                rem=n%10;
                rev=rem+(rev*10);
                n=n/10;
            }
            System.out.println("Reverse of the number is "+rev);
        }
    }
}
