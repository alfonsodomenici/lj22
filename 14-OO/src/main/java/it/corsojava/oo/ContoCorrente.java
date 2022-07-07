/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

/**
 *
 * @author java
 */
public class ContoCorrente { 
    //proprietà
    //variabili di stato o di istanza
    public double saldo;
    public final String intestatario;
    
    //medodo costruttore
    public ContoCorrente(String intestatario){
        this.intestatario = intestatario;
    }
    
    //metodi
    public void prelievo(int quantita){
        saldo = saldo - quantita;
    } 
    
    public void versamento(int quantita){
        saldo = saldo + quantita;
    }
}
