package kernel.cmd;

import kernel.ICommandsExecuteListener;
import kernel.RegisterPairs;

public class CMD_Intel8080_XCHG implements ICommand {

    @Override
    public void execute(ICommandsExecuteListener executeListener) {
        // TODO
        int fValue = executeListener.requestOnGetValueFromRegisterPair(RegisterPairs.H);
        int sValue = executeListener.requestOnGetValueFromRegisterPair(RegisterPairs.D);
        executeListener.requestOnSetValueInRegisterPair(RegisterPairs.H, sValue);
        executeListener.requestOnSetValueInRegisterPair(RegisterPairs.D, fValue);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return "XCHG";
    }
}