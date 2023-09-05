public class Ticket {
    private int ticketNumber;
    private Slot slot;

    public Ticket(int ticketNumber, Slot slot){
        this.ticketNumber = ticketNumber;
        this.slot = slot;
    }
    public int getTicketNumber(){
        return ticketNumber;
    }
    public Slot getSlot(){
        return slot;
    }
}
