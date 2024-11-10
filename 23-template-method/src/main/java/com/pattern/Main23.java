package com.pattern;

import javax.xml.parsers.ParserConfigurationException;
import java.net.CacheRequest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main23 {
    public static void main(String[] args) throws ParserConfigurationException {

        Account account = (Account) XMLUtil.getBean();
        account.handle("张无忌","123456");

    }
}