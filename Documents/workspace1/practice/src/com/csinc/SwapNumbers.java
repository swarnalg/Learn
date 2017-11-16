package com.csinc;

/**
 * Created by Bakam on 11/15/17.
 */
public class SwapNumbers {
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c;
        System.out.println("value a:"+a);
        System.out.println("value b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap");
        System.out.println("value a:" +a);
        System.out.println("value b:" +b);

    }
}
