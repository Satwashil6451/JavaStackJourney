/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */

// Polymorphism -- many forms by which we can perform a single action in different ways where poly means many and morphs means forms
/*
types -- 1.Compile-Time Polymorphism (Method Overloading)
      -- 2.Run Time Ploymorphism (Method Overloading)
*/


// 1. Compile-Time Polymorphism (Method Overloading)
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Compile_time_Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
    }
}

