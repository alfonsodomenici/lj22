/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author java
 */
public class UsaConto {

    public static void main(String[] args) {
        
        ContoCorrente cc1 = new ContoCorrente("MarioRossi");
        System.out.println(cc1.getNumero());
        System.out.println("saldo cc1: " + cc1.getSaldo() + " di " + cc1.getIntestatario());

        cc1.versamento(100);

        cc1.versamento(250);

        cc1.prelievo(50);

        ContoCorrente cc2 = new ContoCorrente("Giulia Bianchi");
        System.out.println(cc2.getNumero());
        
        System.out.println("saldo cc2: " + cc2.getSaldo() + " di " + cc2.getIntestatario());

        cc2.versamento(500);

        cc2.prelievo(250);

        cc2.prelievo(200);

        System.out.println("saldo cc1: " + cc1.getSaldo());
        System.out.println("saldo cc2: " + cc2.getSaldo());

        List<ContoCorrente> conti = new ArrayList<>();

        conti.add(cc1);
        conti.add(cc2);

        conti.get(0).versamento(100);

        System.out.println("saldo cc1: " + cc1.getSaldo());

        System.out.println("L'interesse dei cc è: " + ContoCorrente.getInteresse());

        System.out.println("saldo con interesse cc1: " + cc1.getSaldoConInteresse());
        System.out.println("saldo con interesse cc2: " + cc2.getSaldoConInteresse());
    }
}
