package StaticDemo;
import java.util.*;
public class Main {
    static void displayDetails(Event e){
        System.out.println("Inside Static Method");
        System.out.println("Event Name: "+e.getEName());
        System.out.println("Hall Name: "+e.getHName());
        System.out.println("Start Date: "+e.getSDAte());
        System.out.println("End Date: "+e.getEDate());
        System.out.println("No of People: "+e.getPeople());

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Event e=new Event();
        System.out.println("Enter the event name");
        e.setEName(sc.next());
        System.out.println("Enter the hall name");
        String hallname=sc.nextLine();
        hallname=sc.nextLine();
        e.setHName(hallname);
        System.out.println("Enter the start date(dd/MM/yyyy)");
        e.setSDAte(sc.next());
        System.out.println("Enter the end date(dd/MM/yyyy)");
        e.setEDate(sc.next());
        System.out.println("Enter the no of people ");
        e.setPeople(sc.nextInt());
        displayDetails(e);
        e.display();
    }
}
