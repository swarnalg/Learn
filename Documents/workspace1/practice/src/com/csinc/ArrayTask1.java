package com.csinc;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
1. Maximum of an array of 20 numbers
        1. In the method initializeArray():
        1.1. Create an array of 20 numbers
        1.2. Read from the keyboard 20 numbers and fill the array with them
        2. The method max(int[] array) should find the maximum number of the elements of the array
*/
public class ArrayTask1
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println("printing max" + "::" + max);
    }



    public static int[] initializeArray()
    {
        int[] arrayofNumbers;
        arrayofNumbers =new int[5];
        for(int i = 0;i< 20;i++)
        {
            // Scanner in = new Scanner(System.in);
            // arrayofNumbers[i] = in.nextInt();
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                arrayofNumbers[i] = Integer.parseInt(reader.readLine().trim());
            }
            catch(IOException ioe)
            {
                System.out.println("IOException is handled");
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("NumberFormatException is handled");
            }

        }
        return arrayofNumbers;
    }
    public static int max(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }
}

