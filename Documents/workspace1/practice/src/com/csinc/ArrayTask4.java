package com.csinc;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
4. Array of numbers in reverse order
        1. Create an array of 10 numbers.
        2. Read from the keyboard 10 numbers and store them in the array.
        3. Arrange array elements in reverse order.
        4. Display to the screen the result. Each value should be on a new line.
        */

public class ArrayTask4{
    public static void main(String[] args) throws Exception
    {
        String[] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<list.length; i++)
            list[i] = reader.readLine();


            for(int j=1; j<=list.length; j++)
                System.out.println(list[list.length - j]);



    }

}
