package com.csinc;

/* Write a program that reads two names from keyboard, and if the names are the same, displays «Names are identical».
    Display «Name lengths are equal» if the names are different, but their lengths are equal.
*/

import java.io.*;
public class EqualNames
{
        public static void main(String[] args) throws Exception
        {
            BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));

            String name=bufferedreader.readLine();
            String name1=bufferedreader.readLine();
            if (name.equals(name1))
                System.out.println("Names are identical");
            else
            if (name.length() == name1.length())
                System.out.println("Name lengths are equal");

        }
    }


