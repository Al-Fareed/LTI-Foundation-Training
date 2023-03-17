import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemTypeBO itemTypeBO = new ItemTypeBO();
        ItemType[] itemTypeArray = new ItemType[10];
        System.out.println("Enter the Number of Item Type");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the Item Type " + (i + 1) + " Name");
            String name = scanner.next();
            System.out.println("Enter the Deposit Amount");
            double deposit = scanner.nextDouble();
            System.out.println("Enter the Cost per day");
            double costPerDay = scanner.nextDouble();
            ItemType itemType = new ItemType(name, deposit, costPerDay);
            itemTypeBO.add(itemType, itemTypeArray, i);
        }
        itemTypeBO.display(itemTypeArray);
        System.out.println("Enter the Name of the item to be searched");
        String search = scanner.next();
        itemTypeBO.search(search, itemTypeArray);
        scanner.close();
    }
}