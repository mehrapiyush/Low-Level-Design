// Receiver 1
public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is off");
    }
}
