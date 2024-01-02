package org.example.codepuzzle;

public class B extends A {
    public B() {
        System.out.println("B");
    }

    @Override
    void m1() throws IndexOutOfBoundsException {
        System.out.println("In B m2");
    }

    void m2(){
        System.out.println("In m2 B");
    }

    public static void main(String[] args)
    {
        A a = new B();
        a.m1();
    }
}
