/*
 * Write a program to swap two numbers using bitwise XOR operator.

Input and Output Format:
Input consists of two integers.
Refer sample Input Output for output format.
[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:
Enter the two numbers
3
4
The two values after swapping are
4
3
 */
import java.util.*;
public class SwapUsingXOR
{
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the two numbers");
        int x = sc.nextInt();
        	int y= sc.nextInt();
        x = x ^ y;
          
            y = x ^ y;
            
            x = x ^ y;
            System.out.println("The two values after swapping are\n"+x+"\n"+y);
    }
	}
}
