import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of users:");
        int n = sc.nextInt();
        User[] userArray = new User[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of User " + (i + 1));
            System.out.println("Enter the name of the user:");
            String name = sc.next();
            System.out.println("Enter the mobile number of the user:");
            String mobileNumber = sc.next();
            System.out.println("Enter the username of the user:");
            String username = sc.next();
            System.out.println("Enter the password of the user:");
            String password = sc.next();

            userArray[i] = new User(name, mobileNumber, username, password);
        }

        System.out.println("User details as entered:");
        UserBO userBO = new UserBO(userArray);
        userBO.displayAll(userArray);

        userBO.sortUsers(userArray);
        System.out.println("After sorting:");
        userBO.displayAll(userArray);

        System.out.println("Enter the user to be deleted:");
        String name = sc.next();
        Boolean result = userBO.deleteUser(userArray, name);
        if (result) {
         System.out.println("User deleted successfully ");
         System.out.println("After Deleting:");
         userBO.display(userArray,name);
        }
        else{
            System.out.println("No user found with given name");
        }
    }
}
