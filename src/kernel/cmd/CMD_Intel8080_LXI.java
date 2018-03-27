package kernel.cmd;

import kernel.IMicroprocessor;

public class CMD_Intel8080_LXI implements ICommand {

    private String firstArg;
    private String secondArg;

    public CMD_Intel8080_LXI(String firstArg, String secondArg) {
        this.firstArg = firstArg.toUpperCase();
        this.secondArg = secondArg.toUpperCase();
    }

    @Override
    public void execute(IMicroprocessor microprocessor) {
        int value = Integer.valueOf(secondArg, 16);
        microprocessor.setValueByRegisterName(firstArg, value / 256);
        switch (firstArg) {
            case "B": {
                microprocessor.setValueByRegisterName("C", value % 256);
                break;
            }
            case "D": {
                microprocessor.setValueByRegisterName("E", value % 256);
                break;
            }
            case "H": {
                microprocessor.setValueByRegisterName("L", value % 256);
                break;
            }
        }
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public String getName() {
        return "LXI " + firstArg + "," + secondArg;
    }
}