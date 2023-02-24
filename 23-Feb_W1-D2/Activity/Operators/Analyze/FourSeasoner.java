package Analyze;
/*
 * Dinesh also joined the group of 3 idiots and now their group is called Four Seasoners. Meanwhile, Binoy has moved to a new house in the same locality. Now the houses of Ajay, Binoy and Chandru are in the located in the shape of a triangle. Dinesh also has moved to a house in the same locality. When Ajay asked Dinesh about the location of his house , Dinesh said that his house is equidistant from the houses of the other 3. Though Ajay was good in Mathematics, he was puzzled. Can you please help Ajay out?


Given the 3 vertices {(x1,y1), (x2,y2) and (x3,y3)} of a triangle, write a C program to determine the point which is the centroid for the 3 vertices.


Input Format:

Input consists of 6 integers. The first integer corresponds to x1 . The second integer corresponds to y1. The third and fouth integers correspond to x2 and y2 respectively.

The fifth and sixth integers correspond to x3 and y3 respectively.

Output Format:

Refer Sample Input and Output for exact formatting specifications.

[All floating point values are displayed correct to 1 decimal place]

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

Enter x1

2

Enter y1

4

Enter x2

10

Enter y2

15

Enter x3

5

Enter y3

8

Dinesh's house is located at (5.7 , 9.0)
 */

import java.util.*;

public class FourSeasoner{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
float a, b;
int x1,y1,x2 ,y2,x3,y3;

System.out.println("Enter x1");

x1=in.nextInt();

System.out.println("Enter y1");

y1=in.nextInt();

System.out.println("Enter x2");

x2=in.nextInt();
x2=in.nextInt();

System.out.println("Enter y2" );

y2=in.nextInt();

System.out.println("Enter x3");

x3= in.nextInt();

System.out.println("Enter y3 ");;

y3=in.nextInt();

a=(float)(x1+x2+x3)/3;

b=(float)(y1+y2+y3)/3;

System.out.printf("Dineshs house is located at(%.1f ,%.1f)" ,a,b);


}
}