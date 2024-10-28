package com.pattern;

public class AccessValidator {
    //模拟实现登录验证
    public boolean validate(String userId){
        System.out.println("在数据库中验证用户"+userId+"是否为合法用户");
        if (userId.equalsIgnoreCase("杨过")){
            System.out.println("登陆成功");
            return true;
        }else{
            System.out.println("登录失败");
            return false;
        }
    }
}
