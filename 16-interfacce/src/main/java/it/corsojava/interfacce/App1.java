/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

import java.io.Reader;

/**
 *
 * @author ospite
 */
public class App1 {

    public static void main(String[] args) {
        
        A a = new B("11111", "222222", "3333333");

        a.m1();

        System.out.println(a.getClass().getName());

        if (a.getClass().equals(B.class)) {
            System.out.println("a è di tipo B");
        }
        
        if (a instanceof B) {
            B b = (B) a;
            b.m2();
        }
        
        System.out.println("--------------------------");
        
        AA aa = new BB();
        aa.m1(10);
        
        B b = new  B("11111", "222222", "3333333");
        
        System.out.println("--------------------------");
        
        b.mm4();
        
    }
}
