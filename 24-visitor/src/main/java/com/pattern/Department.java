package com.pattern;



//部门类 充当抽象访问者类
public abstract class Department {
    public abstract void visit(FulltimeEmployee visitor);
    public abstract void visit(ParttimeEmployee visitor);
}
