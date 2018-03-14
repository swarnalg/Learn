package com.csinc;

/* 5 words in reverse order
   Read from the keyboard 5 words.
   Add them into a string list and display them to the screen in reverse order.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class WordsinReverseOrder {
    public static void main(String args)
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        //Read Strings from keyboard
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            try {
                String s = br.readLine();
                al.add(0,s);
            }
            catch (IOException ioe)
            {
                System.out.println("caught IOE");
            }

        }
        /* Display array data to screen */
        for (int i = 0; i < al.size(); i++)
        {
            int j = al.size() - i - 1;
            System.out.println(al.get(j));

        }
    }
}
