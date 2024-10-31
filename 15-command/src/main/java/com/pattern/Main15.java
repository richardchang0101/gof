package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main15 {
    public static void main(String[] args) throws ParserConfigurationException {
       FunctionButton fb = new FunctionButton();
        Command command = (Command) XMLUtil.getBean();

        fb.setCommand(command);//将命令注入功能
        fb.click();//调用功能键的业务方法
    }
}