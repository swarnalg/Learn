package com.csinc;

// Reading list of numbers from keyboard,even numbers are added to the end of the list,odd numbers are added to the beginning of the list
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ArrayListTask6 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            int x = Integer.parseInt(s);
            if (x % 2 == 0)
                list.add(x);
            else
            list.add(0, x);

        }
    }

}
