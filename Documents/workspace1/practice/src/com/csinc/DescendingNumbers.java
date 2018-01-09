package com.csinc;

/**
 * Created by Bakam on 12/14/17.
 */

/* Write a program that reads three numbers from keyboard and displays them in descending order.
        */
import java.io.*;
public class DescendingNumbers {

        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String k = reader.readLine();
            String l = reader.readLine();
            String m = reader.readLine();
            int a = Integer.parseInt(k);
            int b = Integer.parseInt(l);
            int c = Integer.parseInt(m);
            if ((a>c && a>b ) && (b>c)){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }else if ((a>c && a>b) && (c>b)){
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }else if ((b>a && b>c ) && (c>a)){
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }else if ((b>a && b>c ) && (a>c)){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }else if ((c>a && c>b ) && (b>a)){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }else if ((c>a && c>b ) && (b>a)){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }else if ((c>a && c>b ) && (a>b)){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
}
