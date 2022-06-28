/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.libreria.numeri;

/**
 *
 * @author java
 */
public class Numeri {

    public static boolean isNumeroPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        boolean primo = true;
        int divisore = 2;
        while (divisore < numero && primo == true) {
            if (numero % divisore == 0) {
                primo = false;
            }
            divisore++;
        }
        return primo;
    }
}
