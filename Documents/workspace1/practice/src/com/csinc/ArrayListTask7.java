package com.csinc;

// Delete all the numbers greater than 5


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ArrayListTask7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) > 5)
                list.remove(i);
            else
                i++;
        }

    }
}
