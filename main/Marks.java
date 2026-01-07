/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */

// write a program to take makrs of different subjects and shows grade at last

import java.util.*;

    public class Marks {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks ");
    System.out.print("English = ");
    int eng = sc.nextInt();
    System.out.print("Computer = ");
    int com =sc.nextInt() ;
    int total=eng+com;
    if (total>=90 && total<100) {
    System.out.print("Your Grade is A");
    }else if (total>=80 && total<90) {
    System.out.print ("Your grade is B ");
    }else{
    System.out.print ("You are fail");
}
}
    }