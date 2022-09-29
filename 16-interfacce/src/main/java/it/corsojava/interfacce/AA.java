/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public abstract class AA {
    
    public void m1(int n){
        for (int i = 0; i < n; i++) {
            m2();
        }
    }
    
    public abstract void m2();
}
