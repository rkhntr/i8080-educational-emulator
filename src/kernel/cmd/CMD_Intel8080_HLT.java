package kernel.cmd;

import kernel.IMicroprocessor;

public class CMD_Intel8080_HLT implements ICommand {
    @Override
    public void execute(IMicroprocessor microprocessor) {

    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return "HLT";
    }
}