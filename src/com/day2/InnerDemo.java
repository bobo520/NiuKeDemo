package com.day2;

/**
 * Created by 谭杰文 on 2017/12/16.
 */
public class InnerDemo {
    public class Inner{

    }

    public static void main(String[] args) {
        InnerDemo innerDemo=new InnerDemo();
        Inner inner=innerDemo.new Inner();
        InnerDemo.Inner inner1=innerDemo.new Inner();
//        innerDemo.Inner inner2=innerDemo.new Inner(); 错误
    }
}
