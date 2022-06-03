package com.jay.design_patterns.gof.creational.singleton;

public class BasicEagerSingleton {

    // TODO :: this is eagerly initialized at runtime prior to access it but this is thread safe

    /*
    let's make the constructor private,
    so no class can directly access it, and
    we can make it accessible in a more controlled way using a getter method
    */

    private static BasicEagerSingleton singleton = new BasicEagerSingleton();;

    private BasicEagerSingleton(){}

    /*
    Let's make this class accessible using a getter method which is returning an instance of this class,
    This method should be public static in order to make this method accessible without creating an instance of this class
    since no instance can be created from this class without accessing this method.

    Here we have created instance of singleton in static initializer.
    JVM executes static initializer when the class is loaded and hence this is guaranteed to be thread safe.
    Use this method only when your singleton class is light and is used throughout the execution of your program.
    */

    public static BasicEagerSingleton getInstance(){
        return singleton;
    }
}

