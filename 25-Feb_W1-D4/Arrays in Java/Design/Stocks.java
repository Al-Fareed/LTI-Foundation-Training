/*
 * The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
Input Format
Input consists of n+1 integers. The first integer corresponds to n, the number of days. The next n integers correspond to stock prices on days 1, 2...n.
Output Format
Output consists of n integers that correspond to the span values.
Sample Input:
7
100
80
60
70
60
75
85
Sample Output:
1
1
1
2
1
4
6
 */
import java.util.*;
public class Stocks {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] prices = new int[n];
            int[] spans = new int[n];
            
            // read in the prices
            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }
            
            // calculate the spans
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            spans[0] = 1;
            for (int i = 1; i < n; i++) {
                while (!stack.empty() && prices[stack.peek()] <= prices[i]) {
                    stack.pop();
                }
                spans[i] = (stack.empty()) ? (i + 1) : (i - stack.peek());
                stack.push(i);
            }
            
            // print out the spans
            for (int i = 0; i < n; i++) {
                System.out.println(spans[i]);
            }
        }
    }

}
/*
 * We first read in the number of days n and the stock prices "prices".
 * We create an array spans to hold the span values for each day.
 * We use a stack to keep track of the indices of the previous days whose prices are less than the current day's price.
 * We start by pushing the index of the first day onto the stack and setting its span value to 1.
 * For each subsequent day, we pop indices off the stack until we find an index whose price is greater than the current day's price or the stack becomes empty. The span value for the current day is the difference between the current day's index and the index at the top of the stack, or the current day's index plus 1 if the stack becomes empty.
 * We push the current day's index onto the stack and continue to the next day.
 * Finally, we print out the span values for each day.
 */