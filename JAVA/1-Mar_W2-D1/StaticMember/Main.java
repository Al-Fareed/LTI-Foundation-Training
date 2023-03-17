/*
 * This program is to illustrate the difference between instance variables and static variables.
Create a class named StaticIllustration with the following private member variables.
i1 of type Integer
i2 of type Integer. i2 is a static member.
Include appropriate getters and setters. Methods that access only static members should be declared as static.
Include the method name displayDetails() to display the values in the specified format.
[Format : i1 = “i1val”,i2=”i2val”..... Refer sample output]
Create another class and write a main method to test this class. Create 2 objects of type StaticIllustration in the main method.
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input and Output :
Enter Object 1 details
Enter i1
10
Enter i2
20
Object 1 Details : i1 = 10,i2 = 20
Enter Object 2 details
Enter i1
30
Enter i2
40
Object 2 Details : i1 = 30,i2 = 40
Object 1 Details : i1 = 10,i2 = 40
 */
package StaticMember;
import java.util.*;
public class Main {
    
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StaticIllustration s1=new StaticIllustration();
    StaticIllustration s2=new StaticIllustration();
    System.out.println("Enter Object 1 details");
    System.out.println("Enter i1");
    s1.seti1(sc.nextInt());
    System.out.println("Enter i2");
    s1.seti2(sc.nextInt());
    s1.displayDetails(1);
    
    System.out.println("Enter Object 2 details");
    System.out.println("Enter i1");
    s2.seti1(sc.nextInt());
    System.out.println("Enter i2");
    s2.seti2(sc.nextInt());
    s2.displayDetails(2);
    s1.displayDetails(1);

 } 
}
