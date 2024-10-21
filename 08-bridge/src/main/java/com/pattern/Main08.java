package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main08 {
    public static void main(String[] args) throws ParserConfigurationException {
        Image image;
        ImageImp imp;
        image= (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}