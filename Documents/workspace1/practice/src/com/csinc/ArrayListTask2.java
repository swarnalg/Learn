package com.csinc;

import java.util.ArrayList;

/*1. Create a list of strings.
2. Add 5 strings to the list. «101», «102», «103», «104», «105».
3. Delete the first one, the middle one and the last one.
4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
5. Display to the screen its size. (After deleting one entry, the indexes of other entries change.
For instance, if we delete first element, the second becomes the first one).*/
public class ArrayListTask2
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("101");
        al.add("102");
        al.add("103");
        al.add("104");
        al.add("105");
        al.remove(0);
        al.remove(1);
        al.remove(2);
        int x = al.size();
        for (int i = 0; i < x; i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println(x);
    }
}