/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
An interface in Java is a blueprint of a class.

It is used to define what a class must do, not how it does it.

Think of an interface as a contract 📜.
Any class that implements this contract must provide implementations for all its methods.
Why do we need interfaces?
Interfaces help to:
Achieve abstraction (hide implementation details)
Support multiple inheritance (Java does not allow multiple class inheritance)
Increase loose coupling (code becomes flexible & maintainable)
Standardize behavior across different classes 
*/

package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 
//innterface is mechanism in java to achieve abstraction there can only be anstract methods in java interface not method body
// it is used to achieve abstraction and multiple inheritance in java 

=====================================================
TOPIC: INTERFACE IN JAVA
=====================================================

1. An interface is a blueprint of a class.
2. It contains abstract methods (methods without body).
3. Interface is used to achieve 100% abstraction.
4. A class implements an interface using the 'implements' keyword.
5. Java supports multiple inheritance using interfaces.
6. We cannot create an object of an interface.
7. Methods in interface are public and abstract by default.
*/

interface Payment {

    // Abstract method (no body)
    // Any class that implements Payment MUST define this method
    void pay(int amount);
}

/*
-----------------------------------------------------
CLASS: UPI
-----------------------------------------------------
This class implements the Payment interface.
So it MUST provide implementation of pay() method.
*/
class UPI implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

/*
-----------------------------------------------------
CLASS: CreditCard
-----------------------------------------------------
Another class implementing the same interface.
Each class provides its own implementation.
*/
class CreditCard implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

/*
-----------------------------------------------------
MULTIPLE INHERITANCE USING INTERFACE
-----------------------------------------------------
Java does NOT allow multiple inheritance using classes,
but it ALLOWS multiple inheritance using interfaces.
*/
interface A {
    void show();
}

interface B {
    void display();
}

/*
Class implementing multiple interfaces
*/
class Demo implements A, B {

    public void show() {
        System.out.println("Show method from interface A");
    }

    public void display() {
        System.out.println("Display method from interface B");
    }
}

/*
-----------------------------------------------------
MAIN CLASS
-----------------------------------------------------
Execution starts from main() method.
Demonstrates abstraction and polymorphism.
*/
public class Interface {

    public static void main(String[] args) {

        // Interface reference pointing to UPI object
        // This is runtime polymorphism
        Payment p1 = new UPI();
        p1.pay(500);

        // Interface reference pointing to CreditCard object
        Payment p2 = new CreditCard();
        p2.pay(1000);

        // Multiple inheritance example
        Demo d = new Demo();
        d.show();
        d.display();
    }
}
