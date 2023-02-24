import java.util.Scanner;
public class firstProgram 
{
	public static void main(String[] args) 
	{
	int n ;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int i,m=0,flag=0;        
 	m=n/2;      
    if(n==0||n==1)
	{  
   		System.out.println(" Not prime");      
  	}else{  
		for(i=2;i<=m;i++){      
		if(n%i==0){      
			System.out.println(" Not prime");      
			flag=1;      
			break;      
		}      
   }      
   if(flag==0)  { System.out.println(" Prime"); }  
  }

	}
}