/*
 *String API – lastIndexOf() - Illustration
Write a program to illustrate the use of the method lastIndexOf() defined in the string API.
Note: This problem requires two searches
First search
Find the last occurrence of the given string from starting index till end index
Example:
Amphisoft Technologies is a product company
for this example starting index is 0 and the ending index is 43
the string to be searched is - 'is'
the last occurrence of is - 23
Second search
Find the last occurrence of the given string from starting index till the given index limit
Example:
Amphisoft Technologies is a product company
for this example starting index is 0 and the index limit is 20
the string to be searched is - 'is'
the last occurrence of is - 4
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output:

Enter the string
Amphisoft Technologies is a product company

Enter the string to be searched
is

The index of last occurence of "is" is 23
Enter the index limit
20
First occurence of "is" from 20th index backwards is 4 

 */
import java.util.*;
public class LastIndexOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the string to be searched");
        String find=sc.nextLine();
        int lastInd=str.lastIndexOf(find);
        System.out.println("The index of last occurence of \""+find+"\" is "+lastInd);
        System.out.println("Enter the index limit");
        int limit=sc.nextInt();
        int in=str.lastIndexOf(find,limit);
        System.out.println("First occurence of \""+find+"\" from "+limit+"th index backwards is "+in);
        sc.close();
    }
}
