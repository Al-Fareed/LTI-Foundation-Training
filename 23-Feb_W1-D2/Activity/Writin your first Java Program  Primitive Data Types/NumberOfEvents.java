/*
 * "Pine Tree" Company has signed up a big time Event Management deal from the Rotary Youth Club for a Trade Fair organized at Codissia Complex, wherein all startup companies in the Software industry are demonstrating their latest products and services and meet with industry partners and Customers.

An Event Management System needs to be modified to write a piece of code that will get the input of the number of events to be hosted for the Fair at Codissia from its users and display the same. Help the company to accomplish the requirement.

Input Format:


First line of the input is an integer that corresponds to the number of events to be hosted at Codissia.

Output Format:


Output should display the number of events to be hosted at Codissia.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:


Enter the number of events hosted in Codissia
50
Number of events hosted in Codissia is 50
 */
import java.util.*;
public class NumberOfEvents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events hosted in Codissia");
		int n=sc.nextInt();
		System.out.println("Number of events hosted in Codissia is "+n);
	}

}