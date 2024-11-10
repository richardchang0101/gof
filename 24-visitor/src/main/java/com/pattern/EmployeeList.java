package com.pattern;

import sun.reflect.generics.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    //定义一个集合用于存储员工对象
    private List<Employee> list = new ArrayList<Employee>();
    public void add(Employee e) {
        list.add(e);
    }

    public void accept(Department v) {
        for (Employee employee : list) {
            employee.accept(v);
        }
    }
}
