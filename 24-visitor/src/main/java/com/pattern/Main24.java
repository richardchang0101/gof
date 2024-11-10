package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main24 {
    public static void main(String[] args) throws ParserConfigurationException {
        EmployeeList list = new EmployeeList();
        Employee fte1, fte2, fte3, pte1, pte2;
        fte1=new FulltimeEmployee("张无忌",3200,45);
        fte2=new FulltimeEmployee("杨过",2000,40);
        fte3=new FulltimeEmployee("段誉",2400,38);
        pte1=new ParttimeEmployee("洪七公",88,18);
        pte2 = new ParttimeEmployee("郭靖",60,18);

        list.add(fte1);
        list.add(fte2);
        list.add(fte3);
        list.add(pte1);
        list.add(pte2);

        Department department = (Department) XMLUtil.getBean();
        list.accept(department);
    }
}