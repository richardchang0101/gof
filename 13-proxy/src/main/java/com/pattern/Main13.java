package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main13 {
    public static void main(String[] args) throws ParserConfigurationException {
        Searcher searcher= (Searcher) XMLUtil.getBean();
        searcher.doSearch("杨过","玉女心经");
    }
}