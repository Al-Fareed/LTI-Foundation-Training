/*
 * Static Variable

Write a program to implement static variable concept in your code.

 

Create a class called Customer with the following private member variables.

Datatype	Variable name
string	name
string	account
double	balance
static int	noOfTransactions
Include appropriate getters and setters.

 

Include the following functions in the Customer class.

Member function	Description
void deposit(double amount)	This function accepts the amount as input and displays the balance after the deposit.
void withdrawal(double amount)	This function accepts the amount as input and displays the balance after withdrawing the amount or displays insufficient balance when the balance is low.
 

Create a driver class Main to test above cases.

 

Note:  Each time a transaction is done increment the static variable.

Input and Output Format:
Refer sample input and output for formatting specifications.

Sample Input and Output:
[All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output 1:
Enter the name
JK
Enter the accountType [Current , Savings, Demat]
Current
Enter the balance
5000
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
1
Enter the amount to deposit
1000
Your balance after the transaction is : 6000.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
2
Enter the amount to withdraw
5000
Your balance after the transaction is : 1000.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
3
Number of Transactions done : 2

 

Sample Input and Output 2:
Enter the name
Kirthi
Enter the accountType [Current , Savings, Demat]
Savings
Enter the balance
5000
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
1
Enter the amount to deposit
2500
Your balance after the transaction is : 7500.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
1
Enter the amount to deposit
5000
Your balance after the transaction is : 12500.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
2
Enter the amount to withdraw
13000
Insufficient Balance
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
1
Enter the amount to deposit
3000
Your balance after the transaction is : 15500.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
2
Enter the amount to withdraw
4000
Your balance after the transaction is : 11500.0
Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit
3
Number of Transactions done : 4
 */
package StaticVariable;

public class Customer {

    private String name, account;
    private double balance;
    private static int noOfTransactions=0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setTransactions() {
        noOfTransactions = noOfTransactions + 1;
    }

    public int getTransactions() {
        return noOfTransactions;
    }

    void deposit(double amount) {
        balance +=  amount;
    }

    void withdrawal(double amount) {
        if ((balance - amount) < 0) {
            System.out.println("Insufficient Balance");
        } else {
            setTransactions();
            balance -=  amount;
            System.out.println("Your balance after the transaction is : " + balance);
        }
    }

}
