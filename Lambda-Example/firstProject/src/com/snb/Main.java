package com.snb;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World!");
	FuncInterface fI = (int x) -> System.out.println(x*2);
        fI.abstractFun(20);
    }
}


// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}