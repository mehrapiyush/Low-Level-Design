// Command 1
public class TurnOnCommand implements Command {
    private Device device;
    TurnOnCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
       device.turnOn();
    }
}
