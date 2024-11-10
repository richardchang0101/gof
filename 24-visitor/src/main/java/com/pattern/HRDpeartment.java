package com.pattern;

public class HRDpeartment extends Department{
    @Override
    public void visit(FulltimeEmployee visitor) {
        int workTime = visitor.getWorkTime();
        System.out.println("正式员工"+visitor.getName()+"实际工作时间为"+workTime+"小时");
        if (workTime>40){
            System.out.println("正式员工"+visitor.getName()+"加班时间为"+(workTime-40)+"小时");
        }else if (workTime<40){
            System.out.println("正式员工"+visitor.getName()+"请假时间为"+(40-workTime)+"小时");
        }
    }

    @Override
    public void visit(ParttimeEmployee visitor) {
        //HR部门对临时员工访问
        int workTime = visitor.getWorkTime();
        System.out.println("临时员工"+visitor.getName()+"实际工作时间为"+workTime+"小时");
    }
}
