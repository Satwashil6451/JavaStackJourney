/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */


class Person2 {
    public int age; // if we make it private we cannot access outside the class 
    void output(){
        System.out.println("Age = " + age);
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        Person2 obj = new Person2();
        obj.age= 20;   // if we make the class as private we cannot access outside the class
        obj.output(); // for calling use the methos name which is output here as we have declared it earlier
    }
}
