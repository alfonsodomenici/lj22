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
    private double saldo;
    private final String intestatario;
    private static float interesse;
    private final int numero;
    private static int sequenzaNumero;

    static {
        System.out.println("Costruttore statico");
        interesse = 0.1f;
        sequenzaNumero = 1;
    }

    public ContoCorrente(String intestatario) {
        System.out.println("Costruttore di istanza");
        this.intestatario = intestatario;
        this.numero = sequenzaNumero++;
    }

    //metodi
    public void prelievo(int quantita) {
        saldo = saldo - quantita;
    }

    public void versamento(int quantita) {
        saldo = saldo + quantita;
    }

    /*
    ------------------ get and set ----------------------------
    */
    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldoConInteresse() {
        return saldo + (saldo * interesse);
    }

    public static float getInteresse() {
        return interesse;
    }

    public static void setInteresse(float interesse) {
        ContoCorrente.interesse = interesse;
    }

    public int getNumero() {
        return numero;
    }

    public static int getSequenzaNumero() {
        return sequenzaNumero;
    }

}
