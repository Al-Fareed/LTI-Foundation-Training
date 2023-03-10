package TicketCalculationStatic;

public class Ticket {
    private int ticketid;
    private int price;
    static int totalnooftickets;

    public void setId(int ticketid){
        this.ticketid=ticketid;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setTicketNo(int totalnooftickets){
        Ticket.totalnooftickets=totalnooftickets;
    }
    public int getId(){
        return ticketid;
    }
    public int getPrice(){
        return price;
    }
    public int getNoTickets(){
        return totalnooftickets;
    }

    public int Calculatetotalamount(int nooftickets){
        int totAmnt=(totalnooftickets-nooftickets)*price;
        return totAmnt;
    }
}
