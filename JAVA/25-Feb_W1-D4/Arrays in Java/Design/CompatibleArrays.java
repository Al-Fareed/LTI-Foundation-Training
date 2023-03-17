/*
 * 2 arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i.  Write a  program to find whether 2 arrays are compatible or not.
Note:
Please use the same prompt statements given in the sample input and output
Input Format:
Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.
Output Format:
Refer sample output for details.
Sample Input 1:
5
2
3
6
8
1
1
1
1
1
1
Sample Output 1:
Compatible
Sample Input 2:
5
2
3
6
8
1
1
1
1
1
2
Sample Output 2:
Incompatible
 */

 import java.util.*;
public class CompatibleArrays {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            boolean flag = true;
            int arr1[]=new int[15];
            int arr2[]=new int[15];
            for(int i=0;i<(2*n);i++){
                if(i<n)
                {
                    arr1[i]=sc.nextInt();
                }
                else{
                    arr2[i]=sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = n; j < (2*n); j++) {
                    if(arr1[i]<arr2[j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("Compatible");
            }
            else{
                System.out.println("Incompatible");
            }
        }
    }
}
