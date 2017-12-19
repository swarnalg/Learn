package com.csinc;


/*
Write a program that displays a right triangle composed of eights with sides 10 and 10. Use “for” loop.

    Example:
    8
    88
    888
    ...
*/
public class Triangle {


        public static void main(String[] args) throws Exception
        {
            //Left triangle
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("8");
                }
                System.out.println( );
            }
            // Right Triangle
           /* for(int i = 1;i <= 10; i++){
                for(int j = 10;j > i; j--)
                    System.out.print(" ");
                for(int k = 1;k <= i; k++)
                    System.out.print("*");
                System.out.println();
            } */

            /* Center Triangle
            for (int i = 0; i < 10; i++)
            {
                for (int j = 10; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i + 1; k++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            } */

        }
    }


