package Design;
/*
 Write a program to generate the below series:
3,7,15,31,63,...

Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of the terms in the series separated by a blank space.

Sample Input 1:

6

Sample Output 1:

3 7 15 31 63 127


Sample Input 2:
9

Sample Output 2:
3 7 15 31 63 127 255 511 1023
 */
import java.util.*;
public class GenerateTheSeries {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int num=3;
            for (int i = 0; i <n; i++) {
                System.out.print(num+" ");
                    num = (num*2)+1;
            }
                System.out.println();
        }
    }
}
