package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main22 {
    public static void main(String[] args) throws ParserConfigurationException {
        MovieTicket ticket = new MovieTicket();
        double originalPrice = 60;
        double currentPrice;
        ticket.setPrice(originalPrice);
        System.out.println("原始票价为" + originalPrice);

        Discount discount = (Discount) XMLUtil.getBean();
        ticket.setDiscount(discount);
        currentPrice = ticket.getPrice();
        System.out.println("折后价格为" + currentPrice);

    }
}