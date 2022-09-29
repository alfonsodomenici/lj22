/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public class App {

    public static void main(String[] args) {
        A a = new A("rosso", "verde"); //creare una istanza di A

        System.out.println(a.toString());

        a.setP2("grigio");

        System.out.println(a.toString());

        a.m1();
        
        B b = new B("aaaaa", "bbbbb", "ccccc"); //creare una istanza di B
        
        System.out.println(b.toString());
        
        b.m1();
    }
}
