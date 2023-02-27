/*String Processing
Given a string, write a program to trim all leading and trailing spaces and convert all words in the string except the first word to Upper Case.
Input Format:
Input consists of a string with leading and trailing spaces.
Output Format:
Displays the given string by removing all leading and trailing spaces and convert all words in the string except the first word to Upper Case.
Refer Sample Input and Output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output.]
Sample Input and Output:
Enter the input string
Sample Input and Output:
         Amphisoft Technologies
The processed string is Amphisoft TECHNOLOGIES */
import java.util.*;
public class StringProcessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string");
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        System.out.print("The processed string is ");
        int len = arr.length;
        for (int i=0;i<len;i++) {
            if(i!=(len-1)){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.println(arr[len-1].toUpperCase());
            }

        }

        sc.close();
    }
}
