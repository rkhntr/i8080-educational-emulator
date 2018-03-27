package kernel.cmd;

import kernel.IMicroprocessor;

public class CMD_Intel8080_MVI implements ICommand {

    private String firstArg;
    private String secondArg;

    public CMD_Intel8080_MVI(String firstArg, String secondArg) {
        this.firstArg = firstArg.toUpperCase();
        this.secondArg = secondArg.toUpperCase();
    }

    @Override
    public void execute(IMicroprocessor microprocessor) {
        int value = Integer.valueOf(secondArg, 16);
        microprocessor.setValueByRegisterName(firstArg, value);
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public String getName() {
        return "MVI " + firstArg + "," + secondArg;
    }
}