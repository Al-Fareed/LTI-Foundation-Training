package StaticVariable;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Customer cust = new Customer();
        System.out.println("Enter the name");
        cust.setName(sc.nextLine());
        System.out.println("Enter the accountType [Current , Savings, Demat]");
        cust.setAccount(sc.nextLine());
        System.out.println("Enter the balance");
        cust.setBalance(sc.nextInt());
        int ch;
        do {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    cust.deposit(sc.nextDouble());
                    cust.setTransactions();
                    System.out.println("Your balance after the transaction is : " + cust.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    cust.withdrawal(sc.nextDouble());
                    break;
                case 3:
                    break;
                    default:System.out.println("Invalid choice!");
            }
        } while (ch != 3);
        System.out.println("Number of Transactions done : " + cust.getTransactions());

    }
}
