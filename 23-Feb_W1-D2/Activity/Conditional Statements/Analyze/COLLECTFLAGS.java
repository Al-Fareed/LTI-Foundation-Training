/*
 *  Disneyland introduced a new game named "Collect Flags". Patrick and Johnny found it interesting and wanted to participate in this game. The game has a rule that the participants will be allowed to play the game only for specified number of times. The participant must be informed whether they can play the game based on the number of times they have played before. Can you help in writing this program?

Input Format:

Input consists of 2 integers. The first integer corresponds to the maximum number of times a player can play and the second integer corresponds to the number of times the player has already played.

Output Format:

Output consists of the string “IN” or “OUT”.

Refer sample input and output for further formatting specifications.

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

Sample Input/Output 1:

Enter the maximum number of times

8

Enter the number of games played

3

IN

Sample Input/Output 2:

Enter the maximum number of times

10

Enter the number of games played

10

OUT
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
class COLLECTFLAGS 
{ 
 public static void main(String args[]) throws IOException 
  { 
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
     Integer a,b; 
    System.out.println("Enter the maximum number of times"); 
    a=Integer.parseInt(br.readLine()); 
    System.out.println("Enter the number of games played"); 
    b=Integer.parseInt(br.readLine()); 
    if(b<a) 
    { 
    System.out.print("IN"); 
    } 
    
      else
 
    { 
     System.out.print("OUT"); 
    } 
} 
} 