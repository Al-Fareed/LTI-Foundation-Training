package Customer_Class;

import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the Customer Details");
            System.out.println("Enter the name");
            String name = scanner.nextLine();
            System.out.println("Enter the email");
            scanner.nextLine();
            String email = scanner.nextLine();
            System.out.println("Enter the type");
            scanner.nextLine();
            String type = scanner.nextLine();
            System.out.println("Enter the location");
            scanner.nextLine();
            String location = scanner.nextLine();

            Customer customer = new Customer(name, email, type, location);
            System.out.println("Customer Details");
            System.out.println("Name: " + customer.getCustomerName());
            System.out.println("E-mail: " + customer.getCustomerName());
            System.out.println("Type: " + customer.getCustomerName());
            System.out.println("Location: " + customer.getCustomerName());
        } catch (Exception e) {
        }
        scanner.close();
    }
}
