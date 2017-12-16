package com.day2;

/**
 * Created by 谭杰文 on 2017/12/16.
 */
public class Employee extends Person {
    String empId="0000";
    public Employee(String nm) {
        super(nm);
    }
    //编译报错,必须调用父类的构造方法,但父类只有一个带参数的构造方法
    /*public Employee(String id) {
        empId = id;
    }*/
}
