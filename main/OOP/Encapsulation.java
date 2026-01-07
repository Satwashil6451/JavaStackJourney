package com.mycompany.main.OOP;


/*
Encapsulation is the process of wrapping data and methods together and hiding data using private access, 
while providing controlled access through getter and setter methods.

meaning of encapsulation is to make sure that the sensitive data is hidden from users.
to achieve this u must 
1. declare class variables as private 
2. provide public get and set methods to access and update the value of private variable
*/

class Person {
    private int age;   // **IMPORTANT**  ok so as you can see here the class is private still age is getting displayed 
    // because we intentionally allowed it using getter and setter menthods that's encapsulation

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println(p.getAge());
    }
}

//IRL example 

/*
Real life first (no code)

In real life:
	•	Your bank balance is NOT visible or editable directly
	•	You cannot do:
	•	“balance = 1 crore”
	•	You must:
	•	deposit money
	•	withdraw money
	•	check balance

👉 The balance is hidden
👉 Only allowed operations are exposed

*/