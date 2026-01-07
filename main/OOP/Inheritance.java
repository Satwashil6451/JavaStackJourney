/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */

/* Define -- Inheritance in java is a mechanism in which one object aquires 
             all the properties and behaviours of parent object.

types --
1. Single       -- One child class inherits from one parent class
2. Multilevel   -- A class inherits from a class, which already inherited from another class.
3. Heirarchical -- Multiple child classes inherit from one parent class.
4. Multiple     -- One child class inherits from multiple parent classes
*/

class Human {
    String name;
    int age;
    void eat(){
        System.out.println("Human is eating");
    }
}

class Student extends Human  {
    int rollNo;
    void study(){
        System.out.println("Student is Studying");
    }
}

public class Inheritance {
    public static void main(String[] args) {
          Student s = new Student();
          
          s.name = "Satwashil";   // inheritance
          s.age = 21;             // inheritance
          s.rollNo = 64;          // own
          
          s.eat();        // inherited method 
          s.study();      // own method
    }
}