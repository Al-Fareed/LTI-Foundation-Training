package Customer_Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the type");
        String type = scanner.nextLine();
        System.out.println("Enter the location");
        String location = scanner.nextLine();

            Customer customer = new Customer(name, email, type, location);
            customer.displayDetails();
        } 
    
}
