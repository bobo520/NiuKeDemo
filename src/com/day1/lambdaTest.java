package com.day1;

/**
 * Created by 谭杰文 on 2017/12/15.
 */
public class lambdaTest {
    public static void main(String[] args) {
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
    }
}
