package childCommand;

import parentCommand.Command;
import receiver.TV;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public String toString() {
        return "TVOffCommand";
    }
}
