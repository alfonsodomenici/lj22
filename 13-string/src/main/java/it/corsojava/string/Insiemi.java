/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.string;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author java
 */
public class Insiemi {

    /**
     *
     * @param lista
     * @return la parola più lunga in lista
     */
    public static String parolaPiuLunga(List<String> lista) {
        String risultato = "";
        for (String el : lista) {
            if (el.length() > risultato.length()) {
                risultato = el;
            }
        }
        return risultato;
    }

    /**
     *
     * @param lista
     * @return la porola più corta in lista
     */
    public static String parolaPiuCorta(List<String> lista) {
        String risultato = "";
        for (String el : lista) {
            if (el.length() < risultato.length() || risultato.isEmpty()) {
                risultato = el;
            }
        }
        return risultato;
    }

    /**
     * Cerca la parola in lista
     *
     * @param lista
     * @param parola
     * @return true se trovata
     */
    public static boolean trova(List<String> lista, String parola) {
        for (String el : lista) {
            if (el.equals(parola)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Cerca la parola in lista
     *
     * @param lista
     * @param parola
     * @return true se trovata
     */
    public static boolean trova1(List<String> lista, String parola) {
        return lista.stream()
                .filter(el -> el.equals(parola))
                .findFirst()
                .isPresent();
    }
}
