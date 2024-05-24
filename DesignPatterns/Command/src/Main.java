//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Devices
        Device tv = new TV();
        Device stereo = new Stereo();

        // Commands

        Command turnOnTvCommand = new TurnOnCommand(tv);
        Command turnOffTvCommand = new TurnOffCommand(tv);

        Command turnOnStereoCommand = new TurnOnCommand(stereo);
        Command turnOffStereoCommand = new TurnOffCommand(stereo);

        //
        RemoteControl remoteControl =
                new RemoteControl();
        remoteControl.setCommand(turnOffTvCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOnStereoCommand);
        remoteControl.pressButton();
    }
}