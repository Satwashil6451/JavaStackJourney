/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */

import java.util.Scanner;
public class table_using_loop {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int value = sc.nextInt();
        int i=1;
        
        while(i<=10){
            System.out.println(value+ "*" +i + "="  + value*i);
            i++;
        }
    }
}
