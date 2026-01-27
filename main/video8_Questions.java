/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author satwashil
 */

/* q1 -- Get a number from user and check weather the given
         number is a negative or positive number? */

import java.util.Scanner;
public class video8_Questions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check is it positive or negative : ");
        int num = sc.nextInt();
        
        if (num > 0){
            System.out.println("given number is positive");
        }else if(num < 0) {
            System.out.println("given number is negative");
        }else if (num == 0){
            System.out.println("given number is 0");
        }
        
        //Get a number from user as input and check weather the given number is Even or Odd?
        
        System.out.println("Enter a number to check if it is odd or even : ");
        int xyz = sc.nextInt();
        
        if(xyz%2==0){ //takes modulous and if zero remainder means even
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }

    }
}
