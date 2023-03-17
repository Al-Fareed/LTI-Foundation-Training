/*
 * Trade Fairs are important for companies to present their products and to get in touch with its customers and business parties. One such grandeur Trade Fair Event was organized by the Confederation of National Large Scale Industry.
Number of people who attended the event on the first day was x. But as days progressed, the event gained good response and the number of people who attended the event on the second day was twice the number of people who attended on the first day. Unfortunately due to heavy rains on the third day, the number of people who attended the event was exactly half the number of people who attended on the first day.

Given the total number of people who have attended the event in the first 3 days, find the number of people who have attended the event on day 1, day 2 and day 3.

Input Format:
First line of the input is an integer value that corresponds to the total number of people.

Output Format:
First line of the output should display the number of attendees on day 1.
Second line of the output should display the number of attendees on day 2.
Third line of the output should display the number of attendees on day 3.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the total number of people
10500
Number of attendees on day 1 : 3000
Number of attendees on day 2 : 6000
Number of attendees on day 3 : 1500
 */
import java.util.*; 
public class TradeFair{
    public static void main(String[] args){    	     
          try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the total number of people"); 
               int n=in.nextInt();  
               int day1 = ((2*n)/7);
               int day2 = (2*day1);
               int day3 = (day1/2);
               System.out.println("Number of attendees on day 1 : "+day1); 
               System.out.println("Number of attendees on day 2 : "+day2); 
               System.out.println("Number of attendees on day 3 : "+day3);
        } 
    }
}