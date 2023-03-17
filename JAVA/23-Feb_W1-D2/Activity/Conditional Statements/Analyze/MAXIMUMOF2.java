// Write a program to find the maximum of 2 numbers.
import java.util.*; 
public class MAXIMUMOF2 
{ 
  public static void main(String args[]) 
  { 
    try (Scanner input = new Scanner(System.in)) {
        int x=input.nextInt(); 
        int y=input.nextInt(); 
        int m; 
        if(y>x) 
        { 
          m=y; 
        } 
          else
        { 
          m=x; 
        } 
        System.out.println(m+" is the maximum number");
    } 
  } 
} 
