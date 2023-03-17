/*
 * Write a  program that accepts a character as input and checks whether it is an uppercase letter or lowercase letter or neither.

 

Input Format:

Input consists of a single character.

Output Format:

Output consists of a single line. Refer sample output for the format.

 

Sample Input 1 :

c

Sample Output 1 :

c is lowercase letter

 

Sample Input 2:

A

Sample Output 2:

A is uppercase letter

 

Sample Input 3:

5

Sample Output 2:

5 is neither an uppercase or lowercase letter
 */
import java.util.Scanner;
class CharacterUpperOrLower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch=sc.next().charAt(0);
            if (ch >= 'A' && ch <= 'Z')
                System.out.println( ch +" is uppercase letter");
    
            else if (ch >= 'a' && ch <= 'z')
                System.out.println(ch + " is lowercase letter" );
    
            else
                System.out.println(ch +" is neither an uppercase or lowercase letter" );
        }
    }

}
