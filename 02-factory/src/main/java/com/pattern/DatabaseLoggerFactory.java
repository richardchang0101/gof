package com.pattern;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建数据库日志记录的对象
        Logger logger =new DatebaseLogger();
        return logger;
    }
}
