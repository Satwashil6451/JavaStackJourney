/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */

// question - given letter is vowel or not

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet to check it is vowel or not");
        
        Scanner sc = new Scanner(System.in);
        char value=sc.next().charAt(0);
        switch (value){
            case 'a':
                System.out.println("yes it is Vowel");
                break;
            case 'e':
                System.out.println("yes it is Vowel");
                break;
            case 'i':
                System.out.println("yes it is vowel");
               break;
            case 'o':
                System.out.println("yes it is vowel");
                break;
            case 'u':
                System.out.println("yes it is vowel");
                break;
            default :
                System.out.println("It is not a vowel");
            }
        }
    }

