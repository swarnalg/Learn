package com.csinc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bakamc on 3/20/18.
 */

public class ArrayExample2
{
    public static void main(String args[]) throws IOException
    {
        //#1 Read 10 Strings from the keyboard and filling arry of strings
        /*
        String[] list = new String[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length ; i++)
        {
            list[i] = reader.readLine();
        }
        // Display array to screen
        for (int i = 0; i < list.length ; i++)
        {
            System.out.println(list[i]);
        }

        // Display array to screen
        for (String s:list )
        {
            System.out.println(s);
        }
        */

        //#2 Read 10 numbers from the keyboard and filling arry of Numbers
        int[] numbers  = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++)
        {
           String s= reader.readLine();
           numbers[i] = Integer.parseInt(s);
        }
        // Display array to screen
        /*
        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.println(numbers[i]);
        }
        */
        for (int n:numbers )
        {
            System.out.println(n);
        }
    }
}