package invoker;

import parentCommand.Command;

public class RemoteControl {
    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
        System.out.println( command + " 커맨드로 변경");
    }

    public void useRemoteControl() {
        this.command.execute();
    }
}
