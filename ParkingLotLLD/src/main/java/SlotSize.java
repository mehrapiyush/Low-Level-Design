import java.util.ArrayList;
import java.util.List;

public class SlotSize {
    private List<Slot> slotList;
    public SlotSize(int size){
        slotList = new ArrayList<>();
        initializeList(slotList,size);
    }

    private void initializeList(List<Slot> slotList, int size) {
        for(int i = 0 ; i < size ; i++){
            slotList.add(new Slot(i+1,1));
        }
    }
    public Slot getAvailableSlot(){
        // We can improve this function to bring those slots which are available near to the entrance gate (if there are multiple entrances)
        for(Slot slot : slotList){
            if(slot.getIsEmpty()) return slot;
        }
        return null;
    }

    public void makeAvailableSlotOccupied(Slot slot) {
        slot.setEmpty(false);
    }
}
