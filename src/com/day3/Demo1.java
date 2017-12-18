package com.day3;

/**
 * Created by 谭杰文 on 2017/12/18.
 */
public  class Demo1 {
    public static void main(String args[]){
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b){
        try {
            b += 10;
            return b;
        }
        catch(RuntimeException e)
        {
            }
        catch(Exception e2)
        {
        }
        finally
        {
            b += 10;
            return b;
        }
    }
}
