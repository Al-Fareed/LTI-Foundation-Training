
    /*
 * Write a program to perform the following operations on strings.
Finding the length of the string
Converting to uppercase
Finding the concatenation of 2 strings
To compare 2 strings --- The function returns 0 if the 2 strings are the same, returns -1 if the first string is less than the second string, and returns 1 if the first string is greater than the second string.
Input Format:
Input consists of 2 strings.
Output Format:
Please refer to the sample output for formatting details.

Sample Input 1:
were
apple
Sample Output 1:
The length of the first string is 4
The length of the second string is 5
The uppercase of the first string is WERE
The uppercase of the second string is APPLE
The concatenated string is wereapple
apple appears before were

Sample Input 2:
apple
were
Sample Output 2:
The length of the first string is 5
The length of the second string is 4
The uppercase of the first string is APPLE
The uppercase of the second string is WERE
The concatenated string is applewere
apple appears before were

Sample Input 3:

be

bet

Sample Output 3:

The length of the first string is 2

The length of the second string is 3

The uppercase of the first string is BE

The uppercase of the second string is BET

The concatenated string is bebet

be appears before the bet

 

Sample Input 4:

be

be

Sample Output 4:

The length of the first string is 2

The length of the second string is 2

The uppercase of the first string is BE

The uppercase of the second string is BE

The concatenated string is bebe

Both the input strings are the same

 
 */
import java.util.*;
public class StringOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("The length of the first string is "+str1.length());
        System.out.println("The length of the second string is "+str2.length());
        System.out.println("The uppercase of the first string is "+str1.toUpperCase());
        System.out.println("The uppercase of the second string is "+str2.toUpperCase());
        System.out.println("The concatenated string is "+str1.concat(str2));
        int val= str1.compareTo(str2);
        if(val<0){
            System.out.println(str1+" appears before "+str2);
        }
        else if(val>0){
            System.out.println(str2+" appears before "+str1);
        }
        else{
            System.out.println("Both the input strings are the same");
        }
    }
}
