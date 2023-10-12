import childCommand.TVOffCommand;
import childCommand.TVOnCommand;
import invoker.RemoteControl;
import parentCommand.Command;
import receiver.TV;

public class CommandMain {
    public static void main(String[] args) {
        // 리시버
        TV tv = new TV();

        // 커맨드 객체
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        // 인보커
        RemoteControl remoteControl = new RemoteControl(tvOnCommand);
        // 리모컨으로 tv 켜기
        remoteControl.useRemoteControl();
        // 커맨드 변경
        remoteControl.setCommand(tvOffCommand);
        // 리모컨으로 tv 끄기
        remoteControl.useRemoteControl();
    }
}
