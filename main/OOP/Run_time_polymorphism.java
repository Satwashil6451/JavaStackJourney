/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */


// Run Time Ploymorphism (Method Overloading)

class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    // override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal2 {
    // override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Run_time_polymorphism {
    public static void main(String[] args) {

        Animal2 a;

        a = new Dog2();
        a.sound();   // Dog barks

        a = new Cat2();
        a.sound();   // Cat meows
    }
}