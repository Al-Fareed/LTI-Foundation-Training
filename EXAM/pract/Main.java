/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        varEmp[] ve=new varEmp[10];
        EmpOp eo=new EmpOp();

        System.out.println("Enter the number of Employees:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for "+(i+1)+" Employee");
            System.out.println("Enter the name of the Employee");
            String name=sc.nextLine();
             name=sc.nextLine();
             System.out.println("Enter the ID of the employee");
             long id=sc.nextLong();
             System.out.println("Enter the salary of the employee");
             Double sal=sc.nextDouble();
             System.out.println("Enter the address of the employee");
             String addr=sc.next();
             varEmp varemp=new varEmp(name,id,sal,addr);
             eo.addEmp(varemp,ve,i);
        }
        eo.display(ve);
        sc.nextLine();
        System.out.println("Enter the Name of the employee to be searched");
        String search=sc.nextLine();
        eo.search(ve,search);
    }
}