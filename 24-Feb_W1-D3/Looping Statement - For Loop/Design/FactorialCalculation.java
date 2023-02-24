package Design;
/*
 * Write a program to find the factorial of a given number.
Input Format:
Input consists of a single integer, n.
Output Format:
Output consists of a single integer which corresponds to n!
Sample Input 1:
4
Sample Output 1:
24
Sample Input 2:
6
Sample Output 2:
720
 */
import java.util.*;
class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();
            int i,fact=1;
            for(i=n;i>0;i--)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
     }
}
