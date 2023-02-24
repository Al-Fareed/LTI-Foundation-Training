/*
 * Write a program to find if the given number is odd or even.Using bitwise AND(&) opeartor.

Input Format:
Input consists of an integer corresponding to the given number.

Output Format:
Output consists of a single line denoting if the given number is odd or even.
Refer sample input and output for formatting specifications.

Sample Input 1 :
Enter any number: 4
Sample Output 1 :
4 is even.

Sample Input 2 :
Enter any number: 5
Sample Output 2 :
5 is odd.
 */
import java.util.*;
public class OddOrEven
{
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter any number:");
            int n = sc.nextInt();
            if((n%2)==0)
            {
                System.out.println(n+" is even.");
            }
            else
            {
                System.out.println(n+" is odd.");
            }
    }
	}
}

