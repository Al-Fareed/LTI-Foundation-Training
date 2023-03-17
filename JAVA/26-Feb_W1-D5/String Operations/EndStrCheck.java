/*
 * String API : endsWith() : Illustration
Write a program to illustrate the use of the method endsWith() defined in the string API.
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.


Sample Input and Output 1:
Enter the string
Technology
Enter the end string
Tech
"Technology" does not end with "Tech"
 

Sample Input and Output 2:
Enter the string
Jhon
Enter the end string
on
"Jhon" ends with "on"
 */
import java.util.*;
public class EndStrCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the end string");
        String start=sc.nextLine();
        if(str.endsWith(start)){
            System.out.println("\""+str+"\" ends with \""+start+"\"");
        }
        else{
            System.out.println("\""+str+"\" does not end with \""+start+"\"");
        }
        sc.close();
    }
}
