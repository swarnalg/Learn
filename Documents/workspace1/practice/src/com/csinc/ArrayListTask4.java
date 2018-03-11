package com.csinc;

/*
Task 4. Add 5 strings to the beginning of the list
1. Create a list of strings.
2. Read from the keyboard 5 strings. Add these strings to the beginning of the list, not to the end.
3. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTask4 {
    public static void main(String[] args) throws Exception
    {

        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        //Read Strings from keyboard
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = br.readLine();
            al.add(0,s);

        }
        System.out.println("IOE handled:"+ al);
        //Display array data to screen
        for (int j = 4; j >= 0; j--)
        {
            System.out.println("ArrayList>>" +al.get(j));
        }

    }
}

