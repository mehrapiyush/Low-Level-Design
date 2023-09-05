import java.util.Random;

public class ParkingLot implements Parking {
    private int size;
    private SlotSize slotSize;
    public ParkingLot(int size){
        this.size = size;
        slotSize = new SlotSize(this.size);
    }
    @Override
    public Ticket parkVehicle(Vehicle vehicle) {
        // get unique id
       int uniqueTicketNumber = getUniqueTicketNumber();
       Slot availableSlot = slotSize.getAvailableSlot();
       Ticket ticket = new Ticket(uniqueTicketNumber,availableSlot);
       slotSize.makeAvailableSlotOccupied(availableSlot);
       return ticket;
    }

    private int getUniqueTicketNumber() {
        return new Random().nextInt(1234567);
    }

    @Override
    public void emptyParking(Ticket ticket) {
        // free Slot on the basis of ticket
    }
}
