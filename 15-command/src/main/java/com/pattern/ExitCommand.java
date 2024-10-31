package com.pattern;

//退出命令类，充当具体命令类
public class ExitCommand extends Command {


    private SystemExitClass seObj;
    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    //命令执行方法，将调用请求接受者的业务方法
    @Override
    public void execute() {
        seObj.exit();
    }
}
