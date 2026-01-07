/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.OOP;

/**
 *
 * @author satwashil
 */
public class functions_question_even_odd {
    
    public static boolean ifEven(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(ifEven(7));
    }
}
