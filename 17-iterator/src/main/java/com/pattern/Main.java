package com.pattern;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("倚天剑");
        list.add("屠龙刀");
        list.add("断肠草");
        list.add("葵花宝典");

        AbstractObjectList objectList = new ProductList(list);;
        AbstractIterator abstractIterator = objectList.createIterator();

        System.out.println("正向遍历");
        while(!abstractIterator.isLast()){
            System.out.println(abstractIterator.getNextItem()+",");
            abstractIterator.next();
        }

        System.out.println("逆向遍历");
        while (!abstractIterator.isFirst()){
            System.out.println(abstractIterator.getPreviousItem()+",");
            abstractIterator.previous();
        }
    }
}