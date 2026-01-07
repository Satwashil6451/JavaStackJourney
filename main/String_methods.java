/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */
public class String_methods {
    public static void main(String[] args) {
        
        //concadination -- 
        String first_name = "Satwashil ";
        String Last_name = "Khot";
        String temp = "    khot      ";
        
        //method 1
        String full_name = first_name + Last_name;
        System.out.println(full_name);
        
        //method 2 
        System.out.println(first_name.concat(Last_name));
        
        //string length (return tyoe -- int)
        System.out.println(first_name.length());
        
        // string search (return type -- boolean)
        System.out.println(first_name.contains("was"));
        System.out.println(Last_name.contains("tx"));
        
        // for upper case and lowe case conversion
        System.out.println(first_name.toLowerCase());
        System.out.println(Last_name.toUpperCase());
            
        //equal string check (boolean o/p)
        System.out.println(first_name.equals(Last_name));
        System.out.println(Last_name.equalsIgnoreCase(temp));
        
        // replacing characters 
        System.out.println(first_name.replace('a', 'x'));
        System.out.println(temp.replace("hot", "cool"));
        
        // for deleting soaces Trim method
        System.out.println(temp.trim());
        
        //index of
        System.out.println(first_name.indexOf('a'));
        System.out.println(first_name);
        
        String word = "luccy";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'c') {
                System.out.println(i);
    }
    }   
        
        
    }
    }
