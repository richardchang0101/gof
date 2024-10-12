package com.pattern;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParserConfigurationException {

        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        //如果要换皮肤 直接修改xml配置文件的内容就可以了
        factory= (SkinFactory) XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();

    }
}