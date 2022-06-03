package com.jay.design_patterns.gof.creational.singleton;

public class BasicSingleton {

    private static BasicSingleton singleton;

    // TODO :: this is not thread safe

    /*
    let's make the constructor private,
    so no class can directly access it, and
    we can make it accessible in a more controlled way using a getter method
    */

    private BasicSingleton(){}

    /*
    Let's make this class accessible using a getter method which is returning an instance of this class,
    This method should be public static in order to make this method accessible without creating an instance of this class
    since no instance can be created from this class without accessing this method.

    Here we have declared getInstance() static so that we can call it without instantiating the class. The first time
    getInstance() is called it creates a new singleton object and after that it just returns the same object.
    Note that Singleton obj is not created until we need it and call getInstance() method.
    This is called lazy instantiation
    */

    public static BasicSingleton getInstance(){
        //Let's check if an instance is already created from this class
        if(singleton == null){
            //create an instance and assign it to above private variable
            singleton = new BasicSingleton();
        }

        return singleton;
    }
}

