package Design;

import java.util.Scanner;

/*
 * Write a program to generate the below series:
4,32,128,256, ….n
Input and Output Format:
The first line is the input consists of a single integer that corresponds to n.
The output consists of the series 4,32,128,…..n separated by a space.
Sample Input 1:
4
Sample Output 1:
4 32 128 256
Sample Input 2:
2
Sample Output 2:
4 32
Sample Input 3:
6
Sample Output 3:
4 32 128 256 256 0 
 */
public class GenerateSeries {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int num=4;
            int j=8;
            for (int i = 0; i <n; i++) {
                System.out.print(num+" ");
                    num = num*j;
                    j=j/2;

            }
                System.out.println();
        }
    }
}
