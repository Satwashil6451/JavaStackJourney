
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */

/*
Classes --
A class can be defined as a blueprint from which you can create an
individual object. Class doesn't consume any space.

Syntax:
class Person {
// Class Body
}
*/

public class classes_and_objects {
    String name;
    int age;
    public static void main(String[] args) {
        classes_and_objects obj = new classes_and_objects();
        obj.name = "Satwashil";
        obj.age = 20;
        System.out.println("Name = " + obj.name);
        System.out.println("Age = " + obj.age);
    }    
}
