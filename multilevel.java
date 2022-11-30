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

class C extends B {
void go (){
    System.out.print("They Go ");

}
}

public class Multilevel {
    public static void main(String[] args) {
        C obj1=new C();
        obj1.walk();
        
    }
    
}
