/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author satwashil
 */

/*
Do while Loop in Java --
Unlike while loop and for loop, the do-while check the condition
at the end of loop body. The Java do-while loop is executed at
least once because condition is checked after loop body.

Syntax --
do{
//code to be executed / loop body
//update statement
}while (condition);
*/

public class do_while_loop {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("satwashil");
            i++;
        } while (i <= 5);
    }
}