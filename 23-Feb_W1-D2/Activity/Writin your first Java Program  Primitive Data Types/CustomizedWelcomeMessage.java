/*
 * William, the founder of “Pine Tree” company wished to design an Event Management System that would let its Customers plan and host events seamlessly via an online platform.

As a part of this requirement, William wanted to write a piece of code for his company’s Event Management System that will display customized welcome messages by taking the Customer's name as input. Write a program to achieve William’s task.

Input Format:

The first line of the input is a string that corresponds to a Customer’s name.
[Note: The maximum length of the input string is 50]

Output Format:

The output should display the welcome message along with the Customer’s name.
Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:

Enter your name
Chloe
Hello Chloe! Welcome to Event Management System.
 */
import java.util.*;
public class CustomizedWelcomeMessage {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Hello "+name+"!  Welcome to Event Management System.");

	}
}
