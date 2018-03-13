package com.csinc;

import java.util.ArrayList;

/*1. Create a list of strings.
2. Add 5 strings to the list. «101», «102», «103», «104», «105».
3. Delete the first one, the middle one and the last one.
4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
5. Display to the screen its size. (After deleting one entry, the indexes of other entries change.
For instance, if we delete first element, the second becomes the first one).*/
public class ArrayListTask2 {

    public static
    void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add(0, "101");
        al.add(1, "102");
        al.add(2, "103");
        al.add(3, "104");
        al.add(4, "105");
        System.out.println("Size of list  : " + al.size());
        System.out.println("Arraylist before deleting");
        for (int a = 0; a < al.size(); a++) {
            System.out.println(al.get(a));
        }
        System.out.println("Delete the first one");
        al.remove(0);
        System.out.println("Size of list  : " + al.size());
        for (int a = 0; a < al.size(); a++) {
            System.out.println(al.get(a));
        }
        System.out.println("Delete the middle one");
        al.remove(1);
        System.out.println("Size of list : " + al.size());

        for (int a = 0; a < al.size(); a++) {
            System.out.println(al.get(a));
        }
        System.out.println("Delete the last one");
        al.remove(2);
        System.out.println("Size of list : " + al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}