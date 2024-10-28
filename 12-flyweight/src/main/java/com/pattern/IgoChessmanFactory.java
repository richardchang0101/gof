package com.pattern;

import java.util.HashMap;

//围棋工厂类
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    public static HashMap map;
    public IgoChessmanFactory() {
        map = new HashMap();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();

        map.put("black", black);
        map.put("white", white);
    }
    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }
    //通过key获取存储在map中的享元对象
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) map.get(color);
    }
}
