/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author satwashil
 * 
 * Methods of Java Scanner Class
⚫ int nextInt() = It is used to scan the next token of the input as an integer.
⚫ float nextFloat() = It is used to scan the next token of the input as a float.
⚫ double nextDouble() = It is used to scan the next token of the input as a double.
• byte nextByte() = It is used to scan the next token of the input as a byte.
• String nextLine() = Advances this scanner past the current line.
⚫ boolean nextBoolean() = It is used to scan the next token of the input into a boolean value.
long nextLong() = It is used to scan the next token of the input as a long.
⚫ short nextShort() = It is used to scan the next token of the input as a Short.
• BigInteger nextBigInteger() = It is used to scan the next token of the input as a BigInteger.
⚫ BigDecimal nextBigDecimal() = It is used to scan the next token of the input as a BigDecimal.
 */

import java.util.*;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        sc.nextLine(); // so for name next() for full name nextLine()

        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your Full Name :");
        String fullName = sc.nextLine();
        System.out.println("Hello " + fullName);
    }
}
