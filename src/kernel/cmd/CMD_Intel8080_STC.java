package kernel.cmd;

import kernel.ICommandsExecuteListener;
import kernel.Flags;

public class CMD_Intel8080_STC implements ICommand {
    @Override
    public void execute(ICommandsExecuteListener executeListener) {
        executeListener.requestOnSetValueInFlag(Flags.C, 1);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return "STC";
    }
}