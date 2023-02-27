/*Adjacent characters
Given a string, write a program to compute a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input and Output 1:
Enter the string

hello

The processed string is hel*lo

Sample Input and Output 2:

Enter the string

marvellouss

The processed string is marvel*lous*s */
import java.util.*;
public class findIdenticalcharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        if(str.matches("(\\w)\\1{2,}|(\\w)\\2")){
            System.out.println("hi");
        }
        // for (String string : s) {
        //     System.out.println(string);
        // }
        // System.out.println("The processed string is "+s[0]+"*"+s[1]);
        // sc.close();
    }
}
