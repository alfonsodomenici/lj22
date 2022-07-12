/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author java
 */
public class Anagrafica {

    private final String nome, cognome;
    private final LocalDate dNascita;

    public Anagrafica(String nome, String cognome, LocalDate dNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dNascita = dNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getdNascita() {
        return dNascita;
    }


    
}
