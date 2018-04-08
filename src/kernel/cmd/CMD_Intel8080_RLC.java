package kernel.cmd;

import kernel.ICommandsExecuteListener;
import kernel.Flags;
import kernel.Registers;
import kernel._Byte;

public class CMD_Intel8080_RLC implements ICommand {
    @Override
    public void execute(ICommandsExecuteListener executeListener) {
        int value = executeListener.requestOnGetValueFromRegister(Registers.A);
        value = value << 1;
        if (value > 255) {
            value += 1;
            executeListener.requestOnSetValueInFlag(Flags.C, 1);
        } else {
            executeListener.requestOnSetValueInFlag(Flags.C, 0);
        }
        value = _Byte.getRoundedValue(value);
        executeListener.requestOnSetValueInRegister(Registers.A, value);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return "RLC";
    }
}