package TicketCalculationStatic;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Ticket ticket[]=new Ticket[10];
        System.out.println("Enter no of objects:");
        int n=sc.nextInt();
        System.out.println("Enter the Total no of tickets:");
        Ticket.totalnooftickets=sc.nextInt();
        for (int i = 0; i < n; i++) {
            ticket[i]=new Ticket();
            System.out.println("Enter the ticketid:");
            ticket[i].setId(sc.nextInt());
            System.out.println("Enter the price:");
            ticket[i].setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int nooftickets=sc.nextInt();
            int newNoTickets=(ticket[i].getNoTickets()-nooftickets);
            if((newNoTickets)<0){
                System.out.println("Total no of tickets: "+(ticket[i].getNoTickets()));
                System.out.println("Sorry tickets not available.");
            }
            else{
                System.out.println("Total no of tickets: "+(ticket[i].getNoTickets()));
                System.out.println("Total amount:"+(nooftickets*(ticket[i].getPrice())));
                Ticket.totalnooftickets=Ticket.totalnooftickets-nooftickets;
                System.out.println("Total no of ticket after booking:"+Ticket.totalnooftickets);
            }
        }
    }
}
