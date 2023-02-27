/*String API : startsWith() : Illustration
Write a program to illustrate the use of the method startsWith() defined in the string API.
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output 1:
Enter the string
Technology
Enter the start string
Logic
"Technology" does not start with "Logic"

Sample Input and Output 2:
Enter the string
Technology
Enter the start string
Tech
"Technology" starts with "Tech" */
import java.util.*;
public class StringAPI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the start string");
        String start=sc.nextLine();
        if(str.startsWith(start)){
            System.out.println("\""+str+"\" starts with \""+start+"\"");
        }
        else{
            System.out.println("\""+str+"\" does not start with \""+start+"\"");
        }
        sc.close();
    }
}
