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
Java While Loop - The while loop is used to iterate a part of the program repeatedly until the specified
Boolean condition is true. As soon as the Boolean condition becomes false, the loop
automatically stops.
Syntax--
while(condition){
//code to be executed
increment/decrement statement
*/

public class loops_do_while {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println("Loop working properly");
            i++; //increment operator if we dont write this loop will stay on because i value will be 1 all the time 
             // but now it will increment by one and itll atop at specified condition
        }
    }
}
