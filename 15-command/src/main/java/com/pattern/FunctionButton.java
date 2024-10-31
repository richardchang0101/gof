package com.pattern;

public class FunctionButton {
    //功能键类，充当请求调用者 请求发送者
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.println("单击功能键");
        command.execute();
    }

}
