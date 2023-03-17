/*
 * Write a program to generate the given pattern.

CCCCCC

CCSSCC

SSSSSS

SSSSSS

KKSSKK

KKKKKK

Input and Output Format:

Input consists of a single integer, n. n is always an even integer. n>=6.
Refer sample input and output for formatting specifications.

 

Sample Input 1:

6

 

Sample Output 1:

CCCCCC
CCSSCC
SSSSSS
SSSSSS
KKSSKK
KKKKKK
Sample Input 2:
8

Sample Output 2:
CCCCCCCC
CCCSSCCC
CCSSSSCC
SSSSSSSS
SSSSSSSS
KKSSSSKK
KKKSSKKK
KKKKKKKK
 */
import java.util.Scanner;
    class IPLPattern{
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int countS=0;
                for(int i=1;i<=(n-2)/2;i++){
                    for(int j=1;j<=(n-countS)/2;j++){
                        System.out.print("C");
                    }
                    for(int k=1;k<=countS;k++){
                        System.out.print("S");
                    }
                    for(int j=1;j<=(n-countS)/2;j++){
                        System.out.print("C");
                    }
                    countS+=2;
                    System.out.println();
                }
                for(int i=1;i<=2;i++){
                    for(int j=1;j<=n;j++){
                        System.out.print("S");
                    }
                    System.out.println();
                }
                countS-=2;
                for(int i=1;i<=(n-2)/2;i++){
                    for(int j=1;j<=(n-countS)/2;j++){
                        System.out.print("K");
                    }
                    for(int k=1;k<=countS;k++){
                        System.out.print("S");
                    }
                    for(int j=1;j<=(n-countS)/2;j++){
                        System.out.print("K");
                    }
                    countS-=2;
                    System.out.println();
   }
            }
    }
    }