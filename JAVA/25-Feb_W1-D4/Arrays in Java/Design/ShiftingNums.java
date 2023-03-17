/*One day, Mahirl is interested in finding how to sort a sequence of integers a1, a2, ... an in non-decreasing order.
Being a young kid, the only operation she can perform is a unit shift. That is, she can move the last element of the sequence to its beginning:
a1, a2, ..., an → an, a1, a2, ..., an - 1.
Help Mahirl to calculate: What is the minimum number of operations that she needs to sort the sequence?
Input and Output Format:
The first line contains an integer, n (2 ≤ n ≤ 105).
The second line contains n integer numbers a1, a2, ..., an (1 ≤ ai ≤ 105).
If it's impossible to sort the sequence output -1. Otherwise output the minimum number of operations Mahirl needs to sort it.
Sample Input 1
2
2 1
Sample Output 1
1

Sample Input 2
3
1 3 2
Sample Output 2
-1

Sample Input 3
2
1 2
Sample Output 3
0
*/
import java.util.*;;
/**
 * ShiftingNums
 */
public class ShiftingNums {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        int count=-1;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        if(n>2){
           int j=n-1;
           int temp=0;
           for (int i = 0; i < n; i++) {
               if(arr[i]>arr[j]){
                    count++;
                }
                else if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    // System.out.println("now arrays at 1 "+arr[0]+" 3 "+arr[2]);
                    // System.out.println(arr[i]+" < "+arr[i+1]);
                    if (arr[i] < arr[i + 1]) {
                    // System.out.println("++1");

                        count=-1;
                        break;
                    }else{
                    // System.out.println("==2");

                        count=0;
                        break;
                    }
                }
                else{
                    // System.out.println("--3");
                    count=-1;
                    break;
                }

               j--;
           }
        }
        else if(n==2){
            count=0;
            if(arr[0]<arr[1]){
                count=0;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}