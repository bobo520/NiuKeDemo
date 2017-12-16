package com.day2;

/**
 * Created by 谭杰文 on 2017/12/16.
 */
public class Demo5 {
    static void a(){
        //在类方法可以通过如下代码调用实例方法
    /*    Demo5 demo5=new Demo5();
        demo5.d();*/
        b();
//      d();类方法不能调用实例方法;
    }
    static void b(){}
    static void c(){}
    void d(){
    }
}
