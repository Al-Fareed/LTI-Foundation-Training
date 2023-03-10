public class varEmp {
    String name=new String();
    long id;
    Double sal;
    String addr=new String();
    varEmp(){
        name="";
        id=1000;
        sal=0.0;
        addr="";
    }
    public varEmp(String name,long id,Double sal,String addr){
        this.name=name;
        this.id=id;
        this.sal=sal;
        this.addr=addr;
    }
    public String getName(){
        return name;
    }
    public String getAddr(){
        return addr;
    }
    public long getId(){
        return id;
    }
    public Double getSal(){
        return sal;
    }
}
