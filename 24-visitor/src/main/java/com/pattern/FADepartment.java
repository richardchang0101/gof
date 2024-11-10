package com.pattern;

//财务部类 充当具体访问者类
public class FADepartment extends Department{
    //实现对全体员工访问
    @Override
    public void visit(FulltimeEmployee visitor) {
        int workTime = visitor.getWorkTime();
        double weekWage = visitor.getWeeklyWage();
        if (workTime>40){
            weekWage = weekWage+(40-workTime)*100;
        }else if (workTime<40){
            weekWage = weekWage-(40-workTime)*80;
            if (weekWage<0){
                weekWage = 0;
            }
        }
        System.out.println("正式员工"+visitor.getName()+"实际工资为："+weekWage+"元");
    }

    //实现财务部对兼职员工的访问
    @Override
    public void visit(ParttimeEmployee visitor) {
        int workTime = visitor.getWorkTime();
        double hourWage = visitor.getHourWage();
        System.out.println("临时工"+visitor.getName()+"实际工资为：" +workTime*hourWage+"元");
    }
}
