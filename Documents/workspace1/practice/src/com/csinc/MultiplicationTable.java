package com.csinc;

import java.util.Scanner;

/**
 * Created by Bakam on 12/1/17.
 * /* Multiplication table
 Write a program that displays the multiplication table 10 by 10 as follows:
 1 2 3 …
 2 4 6 …
 3 6 9 …
 …
 */

public class MultiplicationTable {
    public void Multi() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
            /*  int i = 1;
         int j = 1;
    while(i<=10)
    {
        while(j<=10)
        {
            System.out.print(i*j+" ");
            j++;
        }
       i++;
        System.out.println();
        j=1;
    } */

            Scanner sc = new Scanner(System.in);

        }

    }
}

