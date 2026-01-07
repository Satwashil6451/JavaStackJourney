/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */

/*
String are Immutable
Immutable simply means unmodifiable or unchangeable
String name="Satwashil";
name=name+"khot”;

now in this case the name satwashil will be created into string contant pool (which is inner circle of heap memory)
after that khot will be added in the same string so it doesnt get modified thats why strings are immutable...
*/

import java.util.Scanner;
public class Strings_basics_theory {
    public static void main(String[] args) {
        String name = "Satwashil";
        System.out.println(name);
        
        // so to highlight a string directly we have to use 
        System.out.println(" \"satwashil\" ");
        
        System.out.println("sattu \t khot"); // for big space between 2 strings
        
        //input usng string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name here =");
        String name2 = sc.nextLine(); //next only take one word and nextLine will take all words
        System.out.println("Your name is "+ name2);
    }
}
