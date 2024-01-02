package org.example.factorydesignpattern;

public class FactoryClass {

    BaseClass getSubclass(String type) {
        if("A".equalsIgnoreCase(type)){
            return new A();
        }
        else if("B".equalsIgnoreCase(type)){
            return new B();
        }
        else {
            return null;
        }
    }
}
