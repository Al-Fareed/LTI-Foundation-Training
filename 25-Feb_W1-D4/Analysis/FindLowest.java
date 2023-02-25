package Analysis;
/*
 * Write a program to find the minimum element in an array.
Input Format:
Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.
Output Format:
Refer  sample output for details.
Sample Input 1:
5
2
3
6
8
1
Sample Output 1:
1 is the minimum element in the array
 */
import java.util.*; 
class FindLowest 
{ 
    public static void main(String args[]) 
    { 
        Scanner s=new Scanner(System.in); 
        Integer i,n,l,x[]; 
        n=s.nextInt();
        System.out.println("n:"+n); 
        x=new Integer[n]; 
        x[0]=s.nextInt(); 
        System.out.println("x[0]"+x[0]);
        l=x[0]; 
        System.out.println("l:"+l);
        for(i=1;i<n;i++) 
        {
            System.out.println("----------------");
          x[i]=s.nextInt(); 
            System.out.println("x["+i+"] "+x[i]);
            if(l>x[i]) 
            l=x[i]; 
        System.out.println("l="+l);
        } 
        System.out.println(l+" is the minimum element in the array"); 
    } 
} 