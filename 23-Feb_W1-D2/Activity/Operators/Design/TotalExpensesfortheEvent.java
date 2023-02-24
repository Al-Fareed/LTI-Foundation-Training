/*
 * The prime functionality of an Event Management System is budgeting. An Event Management System should estimate the total expenses incurred by an event and the percentage rate of each of the expenses involved in planning and executing an event. William, the founder of "Pine Tree" wanted to include this functionality in his company’s Event Management System.

Write a program to get the branding expenses, travel expenses, food expenses, and logistics expenses as inputs from the user and calculate the total expenses for an event and the percentage rate of each of these expenses.

Note :

Formula to calculate percentage = ( Expenses to be found/Total expenses )*100 

Input Format:

The first input is a Double value that corresponds to the branding expenses.
The second input is a Double value that corresponds to the travel expenses.
The third input is a Double value that corresponds to the food expenses.
The fourth input is a Double value that corresponds to the logistics expenses.

Output Format:

The first line of the output should display the double value that corresponds to the total expenses for the Event.
The next four lines should display the percentage rate of each of the expenses.
All the double values should be displayed upto 2 decimal places.
Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:

Enter branding expenses
20000
Enter travel expenses
40000
Enter food expenses
15000
Enter logistics expenses
25000
Total expenses: Rs.100000.00
Branding expenses percentage: 20.00%
Travel expenses percentage: 40.00%
Food expenses percentage: 15.00%
Logistics expenses percentage: 25.00%
 */
import java.util.*; 
public class TotalExpensesfortheEvent{
    public static void main(String[] args){    	     
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter branding expenses"); 
               float brand = sc.nextFloat();
               System.out.println("Enter travel expenses"); 
               float travel = sc.nextFloat();
               System.out.println("Enter food  expenses"); 
               float food = sc.nextFloat();
               System.out.println("Enter logistics  expenses"); 
               float log=sc.nextFloat();
               float total = (brand+travel+food+log);
               brand = ((brand/total)*100);
               travel = ((travel/total)*100);
               food = ((food/total)*100);
               log = ((log/total)*100);
               System.out.printf("\nTotal expenses: Rs. %.2f",total); 
               System.out.printf("\nBranding expenses percentage:  %.2f",brand);
               System.out.println("%");
               System.out.printf("Travel expenses percentage:  %.2f",travel); 
               System.out.println("%");
               System.out.printf("Food expenses percentage:  %.2f",food);
               System.out.println("%");
               System.out.printf("Logistics expenses percentage:  %.2f",log);
        } 
          System.out.println("%");
    }
}