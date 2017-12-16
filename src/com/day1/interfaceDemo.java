package com.day1;

/**
 * Created by 谭杰文 on 2017/12/15.
 */
//final不能修饰接口
public  interface interfaceDemo {
    public void main(String[] agrs);
    default void test(){
        System.out.println("default method");
    }
    boolean setFlag(Boolean[] test);
    /*//不能有private方法
    private int getSum();*/
    //可以有static方法
    static void add(){
        System.out.println("static method");
    }
    //接口不能有非抽象的普通方法
   /* public void add(){

    }*/
    //接口不能有构造方法
    /*interface(){

    }*/
}
