/*
 *  Patrick and Johnny are now in the third level of "Collect Flags" game. This level contains three different paths. They can go through only one path at a time. Their task is to collect the maximum number of flags. They got a clue that the path number with maximum value will contain maximum flags. Help them to select the path with maximum value.

Input Format:

Input consists of 3 lines. Each line consists of an integer representing the path number.

Output Format:

Output consists of a single line. Refer sample output for the format.

Sample Input :

3

5

1

Sample Output :

5 is the maximum number
 */

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class COLLECTFLAGS_III {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer a, b, c;

        a = Integer.parseInt(br.readLine());

        b = Integer.parseInt(br.readLine());

        c = Integer.parseInt(br.readLine());
        if (a > b && a > c) {
            System.out.println(a + " is the maximum number");

        }

        else if (b > c) {
            System.out.println(b + " is the maximum number");

        }

        else {
            System.out.println(c + " is the maximum number");
        }
    }
}