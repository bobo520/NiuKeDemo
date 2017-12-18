package com.day3;

/**
 * Created by 谭杰文 on 2017/12/18.
 */
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Demo2 extends X{
    Y y=new Y();
    public Demo2(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Demo2();
    }
}
