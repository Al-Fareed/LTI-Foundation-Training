package Design;
/*
 * Write a program to generate the Fibonacci series up to n terms.

Fibonacci series start with 0, 1, 1, 2, 3, ..…

Input Format:

Input consists of a single integer, n.

Output Format:

The output consists of a Fibonacci series.

Sample Input and Output 1:
[All text in bold corresponds to input and the rest corresponds to output.]
Enter the range:
7
Fibonacci series:
0
1
1
2
3
5
8


Sample Input and Output 2:
[All text in bold corresponds to input and the rest corresponds to output.]
Enter the range:
10
Fibonacci series:
0
1
1
2
3
5
8
13
21
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the range:");
            int n=sc.nextInt();
            int f1=0,f2=1,f3;
            if(n==2)
            {
                System.out.println("Fibonacci series:");
                System.out.println(f1+"\n"+f2);
            }
            else if(n==1)
            {
                System.out.println("Fibonacci series:");
                System.out.println(f1);
            }
            else{
                System.out.println("Fibonacci series:");
                System.out.println(f1+"\n"+f2);
                for(int i = 3; i <= n; i++) {
                    f3=f1+f2;
                    System.out.println(f3);
                    f1=f2;
                    f2=f3;
                }
            }
        }
     }
}
