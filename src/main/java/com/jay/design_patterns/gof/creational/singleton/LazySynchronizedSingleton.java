package com.jay.design_patterns.gof.creational.singleton;

public class LazySynchronizedSingleton {

    // TODO :: improve performance

    private static LazySynchronizedSingleton singleton;

    /*
    let's make the constructor private,
    so no class can directly access it, and
    we can make it accessible in a more controlled way using a getter method
    */

    private LazySynchronizedSingleton(){}

    /*
    Let's make this class accessible using a getter method which is returning an instance of this class,
    This method should be public static in order to make this method accessible without creating an instance of this class
    since no instance can be created from this class without accessing this method.

    Here using synchronized makes sure that only one thread at a time can execute getInstance().
    The main disadvantage of this is method is that using synchronized every time while creating the singleton object
    is expensive and may decrease the performance of your program.
    However if performance of getInstance() is not critical for your application this method provides a
    clean and simple solution.
    */

    // Only one thread can execute this at a time
    public static synchronized LazySynchronizedSingleton getInstance(){
        //Let's check if an instance is already created from this class
        if(singleton == null){
            //create an instance and assign it to above private variable
            singleton = new LazySynchronizedSingleton();
        }

        return singleton;
    }
}

