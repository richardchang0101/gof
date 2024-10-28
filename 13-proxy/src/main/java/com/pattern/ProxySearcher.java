package com.pattern;

public class ProxySearcher implements Searcher {

    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator accessValidator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {

        //如果身份验证成功，执行查询操作
        if(this.accessValidator(userId)){
            String result = realSearcher.doSearch(userId, keyword);
            this.log(userId);
            return result;
        }
        return "";
    }

    //创建访问验证对象并调用其validate（）方法实现身份验证
    private boolean accessValidator(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.validate(userId);
    }
    //创建日志记录对象并调用其log方法实现日志记录
    public void log(String userId){
        logger=new Logger();
        logger.log(userId);
    }
}
