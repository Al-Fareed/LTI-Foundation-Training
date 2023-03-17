import java.util.Arrays;

public class UserBO {
    private User[] userArray;

    public UserBO() {
    }

    public UserBO(User[] userArray) {
        this.userArray = userArray;
    }

    public void addUser(User[] userArray, User userIns) {
        int len = userArray.length;
        userArray = Arrays.copyOf(userArray, len + 1);
        userArray[len] = userIns;
    }

    public void sortUsers(User[] userArray) {
        Arrays.sort(userArray, (u1, u2) -> u1.getName().compareTo(u2.getName()));
    }

    public Boolean deleteUser(User[] userArray, String name) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].getName().equals(name)) {
                for (int j = i; j < userArray.length - 1; j++) {
                    userArray[j] = userArray[j + 1];
                }
                userArray = Arrays.copyOf(userArray, userArray.length - 1);
                
                return true;
            }
        }
        return false;
    }
    public void display(User[] userArray,String name){
        System.out.println("User Details:");
        for (int i = 0; i < userArray.length; i++) {
            if(userArray[i].getName().equals(name)){
                continue;
            }
            else{
            System.out.println("User " + (i + 1));
            System.out.println("Name:" + userArray[i].getName());
            System.out.println("Mobile Number:" + userArray[i].getMobileNumber());
            }
        }
    }

    public void displayAll(User[] userArray) {
        System.out.println("User Details:");
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("User " + (i + 1));
            System.out.println("Name:" + userArray[i].getName());
            System.out.println("Mobile Number:" + userArray[i].getMobileNumber());
        }
    }
}
