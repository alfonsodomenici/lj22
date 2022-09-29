/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public String toString() {
        return nome + " " + cognome + " " + dNascita.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.cognome);
        hash = 41 * hash + Objects.hashCode(this.dNascita);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anagrafica other = (Anagrafica) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return Objects.equals(this.dNascita, other.dNascita);
    }

    
    
}
