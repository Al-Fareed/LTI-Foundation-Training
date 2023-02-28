package ClassesAndAttributes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,countryCode,isdCode;
        System.out.println("Enter the country name");
        name=sc.nextLine();
        System.out.println("Enter the country code");
        countryCode=sc.nextLine();
        System.out.println("Enter the isd code");
        isdCode= sc.nextLine();
        Country a=new Country(name,countryCode,isdCode);
        a.display();
    }
}
