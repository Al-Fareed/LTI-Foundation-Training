/*
 * Write a program to determine the grade of the student in a particular subject. Refer to the table given below for grade details.

Marks scored	Grade
100	S
[90,100)	    A
[80,90)     	B
[70,80)	        C
[60,70)	        D
[50,60)	        E
<50	            F
The interval [a,b] includes all numbers greater than or equal to a and less than b.

 

Input and Output Format:
Input consists of a single integer that corresponds to the marks scored by the student.

Print "Invalid Input" if it is not in the range 0 to 100.

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output 1:
Enter the marks

85

The student obtained a B grade

Sample Input and Output 2:
Enter the marks

850

Invalid Input
 */
import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        String grade=null;
        switch(marks/10)
        {
        	case 10:grade = "S" ;
        	        break;
            case 9:grade = "A" ;
        	        break;
            case 8:grade = "B" ;
        	        break;
            case 7:grade = "C" ;
        	        break;
            case 6:grade = "D" ;
        	        break;
            case 5:grade = "E" ;
        	        break;
            case 4:
            case 3:
            case 2:
            case 1:grade = "F" ;
        	        break;
            default:System.out.println("Invalid Input");
        	              
        }
        System.out.println("The student obtained a "+grade+" grade");
    }
	}

}

