package Analyze;
/*
 * The college ground is rectangular in shape. The Management decides to build a fence around the ground. In order to help the construction workers to build a straight fence, they planned to place a thick rope around the ground. They wanted to buy only the exact length of the rope that is needed. They also wanted to cover the entire ground with a thick carpet during rainy season. They wanted to buy only the exact quantity of carpet that is needed. They requested your help.


Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carpet that is needed?


Input Format:

Input consists of 2 integers. The first integer corresponds to the length of the ground and the second integer corresponds to the breadth of the ground.


Output Format:

Refer Sample Input and Output for exact formatting specifications.

 

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

Enter the length of the ground

50

Enter the width of the ground

20

The length of the rope needed is 140m

The quantity of carpet needed is 1000sqm
 */
import java.util.*; 
public class FencingTheGround{ 
public static void main(String []args) 
{ 
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter the length of the ground"); 
         int l=in.nextInt(); 
         System.out.println("Enter the width of the ground"); 
         int w=in.nextInt(); 
        System.out.println("The length of the rope needed is "+((l*2)+(w*2)*(1))+"m"); 
        System.out.println("The quantity of carpet needed is "+(l*w)+"sqm");
    } 
} 
} 