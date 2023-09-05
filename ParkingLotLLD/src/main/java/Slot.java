public class Slot {
    private int slotNumber;
    private int floor;
    private Boolean isEmpty;

    public Slot(int slotNumber, int floor) {
        this.slotNumber = slotNumber;
        this.floor = floor;
        this.isEmpty = true;
    }
    public int getSlot() {
        return slotNumber;
    }
    public int getFloor(){
        return floor;
    }
    public Boolean getIsEmpty(){
        return isEmpty;
    }
    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }
}
