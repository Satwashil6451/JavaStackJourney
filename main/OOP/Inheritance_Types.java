/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */

// ---------- 1. SINGLE INHERITANCE ----------
class Parent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am Child");
    }
}

// ---------- 2. MULTILEVEL INHERITANCE ----------
class GrandParent {
    void showGrandParent() {
        System.out.println("I am GrandParent");
    }
}

class Parent2 extends GrandParent {
    void showParent2() {
        System.out.println("I am Parent2");
    }
}

class Child2 extends Parent2 {
    void showChild2() {
        System.out.println("I am Child2");
    }
}

// ---------- 3. HIERARCHICAL INHERITANCE ----------
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// ---------- 4. MULTIPLE INHERITANCE (USING INTERFACE) ----------
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child3 implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Father's property");
    }

    public void motherProperty() {
        System.out.println("Mother's property");
    }
}

// ---------- MAIN CLASS ----------
public class Inheritance_Types {
    public static void main(String[] args) {

        // 1. Single Inheritance
        Child c = new Child();
        c.showParent();
        c.showChild();

        // 2. Multilevel Inheritance
        Child2 c2 = new Child2();
        c2.showGrandParent();
        c2.showParent2();
        c2.showChild2();

        // 3. Hierarchical Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // 4. Multiple Inheritance
        Child3 c3 = new Child3();
        c3.fatherProperty();
        c3.motherProperty();
    }
}
