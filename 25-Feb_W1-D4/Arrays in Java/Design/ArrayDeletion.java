/*
 * Write a program to delete an element from an array. 
Input Format:
The first line of the input consists of an integer, n that corresponds to the number of elements in the input array.
The next 'n' lines in the input correspond to the elements in the array.Assume that the maximum number of elements in the array is 20.
Next input correspond to the location where you wish to delete an element.
Output Format:
Display the array element after deletion if the given location value is less than array size otherwise print “Invalid Input”.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output.]
Sample Input and Output 1:
Enter the number of elements in the array
5
Enter the elements in the array
1
2
3
4
5
Enter the location where you wish to delete an element
4
Array after deletion is
1
2
3
5
Sample Input and Output 2:
Enter the number of elements in the array
5
Enter the elements in the array
1
2
3
4
5
Enter the location where you wish to delete an element
10
Invalid Input
 */
import java.util.*;
public class ArrayDeletion {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n-1];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the location where you wish to delete an element");;
            int loc=sc.nextInt();
            if((loc>=1)&& (loc<=n)){
                for (int i = 0; i < (loc-1); i++) {
                    arr1[i]=arr[i];
                }
                
                for (int i = (loc-1); i < n; i++) {
                    if((i+1)!=n){
                        arr1[i]=arr[i+1];
                    }
                }
                System.out.println("Array after deletion is");
                for (int i : arr1) {
                    System.out.println(i);
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
    
}
