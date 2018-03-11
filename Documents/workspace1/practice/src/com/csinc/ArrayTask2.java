package com.csinc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
2. Array of strings in reverse order.
        1. Create an array of 10 strings.
        2. Read from the keyboard 8 strings and store them in the array.
        3. Display to the screen the contents of the entire array (10 items) in reverse order. Each item should be on a new line.
*/
public class ArrayTask2 {
    public static void main(String args[]) throws Exception {
        String[] array = new String[8];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<array.length;i++)
            array[i] =reader.readLine();
        for(int j=1;j<=array.length;j++)
            System.out.println(array[array.length - j]);
    }
}

