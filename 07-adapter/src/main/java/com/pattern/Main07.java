package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main07 {
    public static void main(String[] args) throws ParserConfigurationException {

        CarController carController = (CarController) XMLUtil.getBean();

        carController.move();
        carController.phonate();
        carController.twinkle();

    }
}