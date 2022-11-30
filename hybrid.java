/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

class C extends A {

    void go() {
        System.out.print("They Go ");

    }
}

class D extends C {

    void sleep() {
        System.out.print("They Sleep ");

    }
}

public class hybrid {

    public static void main(String[] args) {
        
        D obj1 =new D();
        obj1.eat();
        
        C obj2=new C();
        obj2.eat();
    }

}
