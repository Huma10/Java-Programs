package org.example.factorydesignpattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FactoryClass factoryClass = new FactoryClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class");
        String className= scanner.next();
        BaseClass subclass = factoryClass.getSubclass(className);
        subclass.m1();
        subclass.m2();
    }
}
