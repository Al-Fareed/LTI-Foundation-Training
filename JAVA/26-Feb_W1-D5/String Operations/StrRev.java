/*Write a program to reverse a given string.
Input Format:
Input consists of a string.
Output Format:
Output displays the given string in the reverse order.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output.]
Sample Input and Output:
Enter a string to reverse
Jhon
Reverse of the string is nhoJ */
import java.util.*;
public class StrRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str1=sc.nextLine();
        char [] c=str1.toCharArray();
        System.out.print("Reverse of the string is ");
        for (int i = (str1.length()-1); i >=0 ; i--) {
            System.out.print(c[i]);
        }
        sc.close();
    }
}
