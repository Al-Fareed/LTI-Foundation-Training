/*
 * Write a program to get a double value from the user. Typecase it to float, long, int, short and byte and display the values in a specified format as given in the sample output.
Input and Output Format:

 

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output:

Enter a double value

42356.89

Double value = 42356.89

Typecasted to float : Value = 42356.89

Typecasted to long : Value = 42356

Typecasted to int : Value = 42356

Typecasted to short : Value = -23180

Typecasted to byte : Value = 116
 */

 import java.util.*;
public class TypeCasting{
    public static void main(String[] args){    	     
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a double value");
                double n = sc.nextDouble();
                System.out.println("Double value = "+n);
                System.out.println("Typecasted to float : Value = "+(float)n);
                System.out.println("Typecasted to long : Value = "+(long)n);
                System.out.println("Typecasted to int : Value = "+(int)n);
                System.out.println("Typecasted to short : Value = "+(short)n);
                System.out.println("Typecasted to byte : Value = "+(byte)n);
        }
    }
}