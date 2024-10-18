package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main05 {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log_p,log_new;
        log_p = new WeeklyLog();//创建原型对象
        Attachment attachment = new Attachment(); //创建附件
        log_p.setAttachment(attachment);
        log_new=log_p.clone();
        System.out.println(log_p==log_new);//比较是否相同

        System.out.println(log_p.getAttachment()==log_new.getAttachment()); //比较附件是否相同
        //周报相同 但是附件不同

    }
}