/*
 * Getters and setters
 
Create a class named Player with the following private attributes.
String name
Integer age
String country
Include appropriate getters and setters.
Getters naming convention : getName() ...
Setters naming convention : setName() ...
Example :public void setName(String name){
 this.name = name;
}
public String getName(){
 return this.name;
}
Create another class called Main to test the above class. In the main method, create an object of Player class and display its details.

Input and Output Format:

Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output :
Enter Name:
Amar
Enter Age:
16
Enter Country:
India
Player Details:
Name:Amar
Age:16
Country:India
 */

 /**
  * gettersNsetter
  */
  import java.util.*;

   class Player{
    Scanner sc=new Scanner(System.in);
    private 
    String name,country;
    int age;
    public void setName(){
        name=sc.next();
    }
    public void setCountry(){
        country=sc.next();
    }
    public void setAge(){
        age=sc.nextInt();
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public int getAge(){
        return this.age;
    }
  }

 public class gettersNsetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Player p=new Player();
        System.out.println("Enter Name:");
        p.setName();
        System.out.println("Enter Age:");
        p.setAge();
        System.out.println("Enter Country:");
        p.setCountry();
        System.out.println("Player Details:\nName:"+p.getName()+"\nAge:"+p.getAge()+"\nCountry:"+p.getCountry());
    }
    
 }