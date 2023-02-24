/*
 * Be it a last minute get together, a birthday party or corporate events, the "Pine Tree" Event Management Company helps you plan and execute it better and faster. Nikhil, the founder of the company wanted the Amphi Event Management System to get and display the event details from his Customers for every new order of the Company.

Write a program that will get the input of the event details like name of the event, type of the event, number of people expected, a string value (Y/N) telling whether the event is going to be a paid entry and the projected expenses (in lakhs) for the event. The program should then display the input values as a formatted output.

Input Format:
First input is a string that corresponds to the name of the event. Assume the maximum length of the string as 50.
Second input is a string that corresponds to the type of the event. Assume the maximum length of the string as 50.
Third input is an integer that corresponds to the number of people expected for the event.
Fourth input is a character that corresponds to Y/N telling whether the event is going to be a paid entry or not.
Fifth input is a double value that corresponds to the projected expenses (in lakhs) for the event.

Output Format:
Output should display the event details as given in the sample output.
All double values need to be displayed correct to 1 decimal place
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the name of the event
Food Fest 2017
Enter the type of the event
Public
Enter the number of people expected
5000
Is it a paid entry? (Type Y or N)
N
Enter the projected expenses (in lakhs) for this event
5.7
Event Name : Food Fest 2017
Event Type : Public
Expected Count : 5000
Paid Entry : N
Projected Expense : 5.7L
 */
import java.util.*;
class EventDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the name of the event");
            String name = sc.nextLine();
            System.out.println("Enter the type of the event");
            String type = sc.nextLine();
            System.out.println("Enter the number of people expected");
            int no = sc.nextInt();
            System.out.println("Is it a paid entry? (Type Y or N)");
            String str=sc.next();   
            char ch=str.charAt(0);  
            System.out.println("Enter the projected expenses (in lakhs) for this event");
            float f = sc.nextFloat();
            System.out.println("Event Name : "+name);
            System.out.println("Event Type : "+type);
            System.out.println("Expected Count : "+no);
            System.out.println("Paid Entry : "+ch);
            System.out.printf("Projected Expense :%.1fL",f );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
}