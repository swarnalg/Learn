package com.newyerperson;

/**
 * Created by Bakam on 1/19/18.
 */
public class ProjectRunner {
    public static void main(String args[])
    {
        NewYearPerson newyearperson= new NewYearPerson();
        SantaClass santaclass =new SantaClass();
        FatherFrost fatherfrost = new FatherFrost();
        newyearperson.getBeard();
        newyearperson.getHeadGear();
        newyearperson.getTransportation();
        newyearperson.move();
        newyearperson.sing();
        santaclass.fly();
        fatherfrost.drive();
        
    }
}
