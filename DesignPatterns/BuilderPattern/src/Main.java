//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  Builder Pattern

        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder();
        Computer computer = computerBuilder
                .setHDD("220GB")
                .setRAM("64GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.getHDD()
        + " " + computer.getRAM()+computer.isBluetoothEnabled()+computer.isBluetoothEnabled());

        // Due to private
    }
}