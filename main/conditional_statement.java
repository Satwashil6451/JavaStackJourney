package com.mycompany.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author satwashil
 * 

 

 * this file contains
if statement
if-else statement
if-else-if ladder
nested if statement

 */

import java.util.*; // the mistake you did on this line is by typing utils not util so remember next time
public class conditional_statement {
    public static void main(String[] args) {
        
        /*this is just practice of taking input from user
        Scanner sc = new Scanner(System.in); // this line needs to be in head
        System.out.println("Enter your name : ");
        String num1 = sc.next();
        System.out.println("Hello " + num1);*/
        
        
        //now lets dive in conditional statements
        
        int correctpass = 2345;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password: ");
        int password = sc.nextInt();
        
        if (password==correctpass){
            System.out.println("Welcome Sir!");
        } else{
            System.out.println("Wrong Password... GoodBye!");
        }
    }
}