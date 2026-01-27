/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author satwashil
 */

public class nested_for_loop_question {
    public static void main(String[] args) {
        System.out.println("Printing patern ");
        
        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
