package com.csinc;

import java.io.IOException;

/**
 * Created by Bakam on 11/18/17.
 */
public class PracticePrograms {
    public static void main(String args[]) throws IOException {
        SwapingNumbers sn = new SwapingNumbers();
        MultiplicationTable m=new MultiplicationTable();
        sn.SwappNumbers();
        Minimal m1=new Minimal();
        m1.min(11,12);
        m.Multi();

    }
}
