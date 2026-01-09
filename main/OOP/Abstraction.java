/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */

// Java Abstraction -- it allows us to hide unnecessary information and only show the needed information
import java.util.Scanner;

abstract class Person4{
    abstract void show(); //abstcat mehod cannot have body
    
    Person4(){
        System.out.println("Parent constructor");
    }
}
class student4 extends Person4{
    student4(){
        super(); //for implmenting this child constructor 
        System.out.println("Child Constructor");
    }
    public void show(){
        System.out.println("Child class");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        student4 obj = new student4();
        obj.show();
    }
}
