/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

/**
 *
 * @author java
 */
public class UsaConto {

    public static void main(String[] args) {

        ContoCorrente cc1 = new ContoCorrente("MarioRossi");
        System.out.println("saldo cc1: " + cc1.saldo + " di " + cc1.intestatario);

        
        cc1.versamento(100);

        cc1.versamento(250);

        cc1.prelievo(50);

        ContoCorrente cc2 = new ContoCorrente("Giulia Bianchi");

        System.out.println("saldo cc2: " + cc2.saldo + " di " + cc2.intestatario);

        cc2.versamento(500);

        cc2.prelievo(250);

        cc2.prelievo(200);

        System.out.println("saldo cc1: " + cc1.saldo);
        System.out.println("saldo cc2: " + cc2.saldo);

    }
}
