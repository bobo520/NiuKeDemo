package com.day2;

/**
 * Created by 谭杰文 on 2017/12/16.
 */
public class Demo2 {
    static {
        int x=5;
    }
    static int x,y;
    public static void main(String args[]){
        x--;
        myMethod( );
        System.out.println(x+y+ ++x);
    }
    public static void myMethod( ){
        y=x++ + ++x;
    }
}
