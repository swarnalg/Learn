package com.csinc;

/* 5 different strings in a list
    1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
public class ArrayListTask1 {
    public static void main(String[] args)  {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        int x = list.size();
        System.out.println(x);
        for (int i=0;i<list.size();i++) {
            System.out.println("ArrayList : " + list.get(i));
        }
    }
}

