package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main02 {
    public static void main(String[] args) throws ParserConfigurationException {
        LoggerFactory loggerFactory ;
        Logger logger;
//        loggerFactory =new DatabaseLoggerFactory();
//        logger = loggerFactory.createLogger();
//        logger.writeLog();

        //通过反射来获取工厂类 较之上面方式更加优雅
        loggerFactory= (LoggerFactory) XMLUtil.getBean();
        logger = loggerFactory.createLogger();

        logger.writeLog();

    }
}