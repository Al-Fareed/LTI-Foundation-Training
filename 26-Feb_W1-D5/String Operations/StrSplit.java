/*String API : split() : Illustration
Write a program to split a string based on spaces (there may be multiple spaces too) and returns the string into separate word.
Input Format:
Input consists of a string.
Output Format:
Refer sample output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input :
Enter the string
ABCD Technologies is a private organization
Sample Output:

The words in the string are

ABCD

Technologies

is

a

private

organization */

import java.util.*;
public class StrSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("The words in the string are");
        String arr[]=str.split(" ");
        for (String string : arr) {
            System.out.println(string);
        }
        sc.close();
    }
}
