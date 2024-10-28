package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IgoChessman black1, black2,white1, white2;
        IgoChessmanFactory factory;
        factory = IgoChessmanFactory.getInstance();

        //通过享元工厂获取3颗黑子
        black1 = factory.getIgoChessman("black");
        black2 = factory.getIgoChessman("black");
        System.out.println(black1==black2);  //虽然获取了两颗黑色棋子 但是地址是相同的 是同一个元素，在享元工厂使用单例模式和简单工厂模式，确保了享元工厂对象唯一性
        white1 = factory.getIgoChessman("white");
        white2 = factory.getIgoChessman("white");
        System.out.println(white1==white2);
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(2,3));
        white1.display(new Coordinates(3,4));
        white2.display(new Coordinates(4,5) );

    }
}