package com.csinc;

/**
 * Created by bakamc on 3/20/18.
 */

public class ArrayExample1
{
    public static void main(String args[])
    {
        int[] numbers = new int[10];
        for (int i = 0; i<numbers.length ; i++)
        {
            //#1 Filling an array of 10 numbers with numbers from 1 to 10
            //numbers[i] = i+1;
            //#2 Filling an array of 10 numbers with numbers from 10 to 1
            //numbers[i] = 10-i;
            //#3 Filling an array of 10 numbers with numbers from 0 to 9
            //numbers[i] = i;
            //#4 Filling an array of 10 numbers with numbers from 9 to 0
            numbers[i] = 9-i;
        }
        //display to the screen
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]);
            System.out.print(",");
        }
    }
}