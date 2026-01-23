package com.mycompany.main;

/**
 *
 * @author satwashil
 */

import java.util.Scanner;
public class coditional_nestedIF_calculator {
    public static void main(String[] args) {
        System.out.println("Wecome");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        
        System.out.println("Which operation do you want to perform +,-,*  = ");
        char op= sc.next().charAt(0);
        
        if(op == '+'){
            int sum = num1+num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }else if(op == '-'){
            int substract = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + substract);
        }else if (op == '*'){
            int multiply = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + multiply);
        }
    }
}