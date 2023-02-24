/*
 * The four basic mathematical operations are Addition, Subtraction, Multiplication, and Division. They are actually the core part of every mathematical problem.

Write a program to perform all the above mathematical operations in a menu-driven format.

Input and Output format:

The first and second line of the input is an integer value.

The output must be either of Addition, Subtraction, Multiplication, and Division(True Division).

Refer sample input and output for formatting specifications.

Sample Input and Output 1 :

Enter the first value :
3
Enter the second value :

3

Enter the choice from the menu
1.Addition
2.Subtraction
3.Multiplication
4.Division
1
The value after Addition is 6.

Sample Input and Output 2 :

Enter the first value :
5
Enter the second value :
3
Enter the choice from the menu
1.Addition
2.Subtraction
3.Multiplication
4.Division
2
The value after Subtraction is 2.

Sample Input and Output 3 :

Enter the first value :
4
Enter the second value :
2
Enter the choice from the menu
1.Addition
2.Subtraction
3.Multiplication
4.Division
3
The value after Multiplication is 8.

Sample Input and Output 4 :

Enter the first value :
8
Enter the second value :
4
Enter the choice from the menu
1.Addition
2.Subtraction
3.Multiplication
4.Division
4
The value after Division is 2.
 */

 import java.util.*;
 class Calculator{
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the first value :");
            int a=sc.nextInt();
            System.out.println("Enter the second value :");
            int b=sc.nextInt();
            String op="";
            int ch;
            int ans=0;
            do{
                System.out.println("Enter the choice from the menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:ans = (a+b);
                        op="Addition";
                        break;
                    case 2:ans=(a-b);
                    op="Subtraction";
                        break;
                    case 3:ans=(a*b);
                    op = "Multiplication";
                        break;
                    case 4:ans=(a/b);
                    op = "Division";
                        break;
                }
                break;
            }while(true);
            System.out.println("The value after "+op+" is"+ans+".");
        }
    }
 }