/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

interface A {
   public void eat();
}

interface B {
   public void walk();
}

class C implements A,B {  
    public void walk(){
    System.out.println("They Walk");
    }
    
    public void eat(){
    System.out.println("They eat ");
    }
}


public class multiple {
    public static void main(String[] args) {
        C obj1=new C ();
        obj1.eat();
        obj1.walk();
    }
    
}
