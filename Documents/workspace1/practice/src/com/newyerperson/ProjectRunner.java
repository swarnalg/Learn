package com.newyerperson;

/**
 * Created by Bakam on 1/19/18.
 */
public class ProjectRunner {
    public static void main(String args[])
    {
        NewYearPerson nyp = new NewYearPerson();
        SantaClass sc =new SantaClass();
        FatherFrost ff = new FatherFrost();
        nyp.getBeard();
        nyp.getHeadGear();
        nyp.getTransportation();
        nyp.move();
        nyp.sing();
        
    }
}
