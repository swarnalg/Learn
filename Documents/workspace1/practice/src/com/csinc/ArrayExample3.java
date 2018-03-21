package com.csinc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bakamc on 3/20/18.
 */

public class ArrayExample3
{
    public static void main(String args[]) {
         /*
         // static intalization
         int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
         //#1 calculation of elements sum
         int sum = 0;
         for (int i = 0; i < list.length; i++)
         sum+=list[i];
         System.out.println("Sum of numbers::"+sum);
      */

        //#2 Searching the min element in the array
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
        int min = list[0];
        for (int i = 0; i <list.length ; i++)
        {
         if (list[i]< min);
         min = list[i];

        }
        System.out.println("minimum of the list :: "+min);

    }

}