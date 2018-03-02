package com.csinc;
import java.io.BufferedReader;
import java.io.InputStreamReader;


// Array of strings in reverse order

//1. Create an array of 10 strings.

//2. Read from the keyboard 8 strings and store them in the array.

//3. Display to the screen the contents of the entire array (10 items) in reverse order. Each item should be on a new line.

/**
 * Created by Bakam on 2/27/18.
 */

public class ArrayReverseOrder {
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
