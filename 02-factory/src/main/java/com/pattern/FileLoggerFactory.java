package com.pattern;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        //创建文件日志记录的对象实例
        Logger logger = new FileLogger();
        return logger;
    }
}
