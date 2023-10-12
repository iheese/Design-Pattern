package childCommand;

import parentCommand.Command;
import receiver.TV;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public String toString() {
        return "TVOnCommand";
    }
}
