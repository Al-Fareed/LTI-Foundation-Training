import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int loc=sc.nextInt();
        int val=sc.nextInt();
        loc=loc-1;
        int aLen=n+1;
        float a[]=new float[aLen];
        for (int i = 0; i < aLen; i++) {
            if(i<loc){
                a[i]=arr[i];
            }
            else if(i==loc){
                a[i]=val;
            }
            else{
                a[i]=arr[i-1];
            }
        }
        for (int i = 0; i < aLen; i++) {
            System.out.printf("%.1f ",a[i]);
        }
        Arrays.sort(a);
        System.out.println();
        for(int i=0;i<aLen-1;i++){
            if(a[i]==a[i+1]){
                System.out.printf("%.1f",a[i]);
                System.out.println();
            }
        }
    }
}