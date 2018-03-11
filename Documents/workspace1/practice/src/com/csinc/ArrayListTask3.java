package com.csinc;

/*
        Task 3. 5 lines in reverse order
        1. Create a list of strings.
        2. Read 5 strings from keyboard, then add them to the list.
        3. Arrange them in reverse order.
        4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTask3 {
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));

        }
    }
}

