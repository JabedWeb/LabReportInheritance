/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.inheritance;

class A {

    void eat() {
        System.out.print("They eat rice");
    }

}

class B extends A {

    void walk() {
        System.out.print("They Walk");

    }
}

public class single {

    public static void main(String[] args) {

        B obj1 = new B();
        obj1.eat();
    }

}
