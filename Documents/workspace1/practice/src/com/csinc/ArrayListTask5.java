package com.csinc;

/*
Task 5. Delete the last string and add it to the beginning of the list
1. Create a list of strings.
2. Read from keyboard 5 strings. Add these strings to the list.
3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTask5 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 5; i++)
        {
            String s = r.readLine(); list.add(s);
        }
        for(int i = 0; i < 13; i++) {
            String last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, last);
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }

}


