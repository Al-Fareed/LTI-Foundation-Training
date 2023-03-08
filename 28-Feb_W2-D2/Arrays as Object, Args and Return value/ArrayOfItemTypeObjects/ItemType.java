
public class ItemType {
    String name=new String();
    Double deposit,costPerDay;
    ItemType(){
        name="";
        deposit=0.00;
        costPerDay=0.00;
    }
    public ItemType(String name,Double deposit,Double cost){
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=cost;
    }
    public String getName(){
        return name;
    }
    public Double getDeposit(){
        return deposit;
    }
    public Double getCostPerDay(){
        return costPerDay;
    }
    
   
}
