/*
 * Write a program using a while loop to find the sum of digits of a given number.

Input Format :

Input consists of a positive integer value.

Output Format :

The output consists of the sum of digits in the input value.

Refer to Sample Input and Output for further details.

Sample Input 1 :

Enter the value :

1345

Sample Output 1 :

Sum of digits in 1345 is 13

Sample Input 2 :

Enter the value :

11111

Sample Output  2 :

Sum of digits in 11111 is 5
 */
import java.util.*;
class SumOfNumbers {
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the value :");
        int n=sc.nextInt();
        int num=n;
        int rem=0,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits in "+num+" is "+sum);
    }
}
}