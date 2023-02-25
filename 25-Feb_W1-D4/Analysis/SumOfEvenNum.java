package Analysis;

import java.util.*;

/**
 * Write a program to find the sum of even numbers in an array.
 * Input Format:
 * Input consists of n+1 integers. The first integer corresponds to ‘n’ , the
 * size of the array. The next ‘n’ integers correspond to the elements in the
 * array. Assume that the maximum value of n is 15.
 * Output Format:
 * Refer sample output for details.
 * Sample Input :
 * 5
 * 2
 * 3
 * 6
 * 8
 * -1
 * Sample Output :
 * The sum of the even numbers in the array is 16
 */
public class SumOfEvenNum {
    public static void main(String args[]) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                int nextInput = sc.nextInt();
                numbers[i] = nextInput;
            }
            int sum = 0;
            for (int s : numbers) {
                if (s % 2 == 0) {
                    
                    sum = sum + s;
                }
            }
            System.out.println("The sum of the even numbers in the array is " + sum);
        }
    }
}