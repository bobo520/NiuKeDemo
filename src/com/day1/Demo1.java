package com.day1;

/**
 * Created by 谭杰文 on 2017/12/15.
 */
public class Demo1 {
    private int a=10;
    int b=20;
    static int c=1;
    //this.c static方法没有this关键字
    public static void main(String arg[]) {
        Demo1 t1 = new Demo1();
        //同一包下可以直接引用不用导包
        Demo2 demo2=new Demo2();
        demo2.hello();
    }

}
