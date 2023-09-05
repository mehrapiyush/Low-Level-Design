
public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot = new ParkingLot(20);

        Car car = new Car(5821,VehicleType.CAR);

        Ticket ticket = parkingLot.parkVehicle(car);
        System.out.println(ticket.getTicketNumber());
        System.out.println(ticket.getSlot().getSlot());
        System.out.println(ticket.getSlot().getFloor());

        Bike bike = new Bike(6149,VehicleType.BIKE);
        Ticket ticket1 = parkingLot.parkVehicle(bike);
        System.out.println(ticket1.getTicketNumber());
        System.out.println(ticket1.getSlot().getSlot());
        System.out.println(ticket1.getSlot().getFloor());


    }
}
