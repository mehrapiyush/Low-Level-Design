public class Bike implements Vehicle{
    private int vehicleNumber;
    private VehicleType vehicleType;

    public Bike(int vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
