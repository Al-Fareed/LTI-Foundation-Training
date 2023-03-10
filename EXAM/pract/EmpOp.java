import java.lang.*;
public class EmpOp  {
    public void addEmp(varEmp ve,varEmp[] varray ,int index){
        varray[index]=ve;
        System.out.println("Employee registeres successfully");
    }
    public void search(varEmp[] ve,String search){
        try{
            boolean found=true;
        if(ve.length!=0){
            for (varEmp emp : ve) {
                if(emp.getName().equals(search)){
                    System.out.println("Employee "+search+" found!");
                    System.out.println("ID:"+emp.getId());
                    System.out.println("Salary:"+emp.getSal());
                    System.out.println("Address:"+emp.getAddr());
                }
                else{
                    found=false;
                }
            }
            if(found==false){
                System.out.println("Employee with Name="+search+" not found!" );
            }
        }
        else{
            System.out.println("No records in Database");
        }
        }catch(Exception e){
            System.out.println();
        }
    }
    public void display(varEmp[] ve){
        try{
            if(ve.length!=0){
                for (varEmp emp : ve) {
                    System.out.println("Details of Employees ID:"+emp.getId());
                    System.out.println("Name:"+emp.getName());
                    System.out.println("Salary:"+emp.getSal());
                    System.out.println("Address:"+emp.getAddr());
                }
            }
        }catch(Exception e){
            System.out.println();
        }
    }
}

