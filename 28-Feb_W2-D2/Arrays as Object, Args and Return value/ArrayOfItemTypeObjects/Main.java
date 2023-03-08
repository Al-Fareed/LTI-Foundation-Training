import java.util.*;

/**
 * Main
 */
public class Main {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Item Type");
    int n=sc.nextInt();
    ItemType it[]=new ItemType[n];
    ItemTypeBO ib=new ItemTypeBO();
    Double deposit,cost;

    for (int i = 0; i < n; i++) {
        System.out.println("Enter the Item Type "+(i+1)+" Name");
           String name=sc.nextLine();
           name=sc.nextLine();
        System.out.println("Enter the Deposit Amount");
            deposit=sc.nextDouble();
        System.out.println("Enter the Cost per day");
            cost=sc.nextDouble();
            ItemType itemType=new ItemType(name,deposit,cost);
            ib.add(itemType, it, i);
        }
        ib.display(it);
        System.out.println("Enter the Name of the item to be searched");
        String search = sc.next();
        ib.search(search, it);

        sc.close();
    }
    
}