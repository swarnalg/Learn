package com.csinc;

/**
 * Created by Bakam on 11/17/17.
 */
public class ReverseNumber {
    public static void main(String args[]){
        int num=123;
        int reversenum =0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);

        






    }
}
