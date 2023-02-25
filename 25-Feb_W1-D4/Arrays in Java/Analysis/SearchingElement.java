/*
 * A  program to search for an element ‘a’ in an array is provided.

Input Format:

Input consists of n+2 integers.
The first integer corresponds to ‘n’ , the size of the array.
The next ‘n’ integers correspond to the elements in the array.
The last integer corresponds to ‘a’, the element to be searched.

Note:
The maximum size of the array is 15.

Output Format:
Refer to the sample output for details.
Sample Input 1:
5
2
3
6
8
1
6

Sample Output 1:
6 is present in the array

Sample Input 2:
5
2
3
6
8
1
9

Sample Output 2:
9 is not present in the array

 */
package Analysis;

import java.util.*;

public class SearchingElement {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int n1;
            int array[] = new int[n];
            int f = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            n1 = scan.nextInt();
            for (int i = 0; i < n; i++) {
                if (array[i] == n1) {
                    f = 1;
                }
            }
            if (f == 1) {
                System.out.println(n1 + " is present in the array");
            } else
                System.out.println(n1 + " is not present in the array");
        }
    }
}