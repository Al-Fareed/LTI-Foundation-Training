package DisplayItemType;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ItemType item=new ItemType();
        System.out.println("Enter the item type name");
        String name=sc.nextLine();
        item.setName(name);
        System.out.println("Enter the cost per day");
        Double cost=sc.nextDouble();
        item.setCostPerDay(cost);
        System.out.println("Enter the deposit");
        Double deposit=sc.nextDouble();
        item.setDeposit(deposit);
        item.display();
    }
}
