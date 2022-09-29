/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public class B extends A{

    private String p3;
    
    public B(String p1, String p2, String p3) {
        super(p1, p2);
        this.p3 = p3;
    }

    @Override
    public void m1() {
       System.out.println("sono il metodo m1 di B");
    }

    
    
    /*
    getter e setter
    */
    public String getP3() {
        return p3;
    }

    @Override
    public String toString() {
        return "B{p1=" +this.getP1() + ",p2=" + this.getP2() + ",p3=" + p3 + '}';
    }
    
    
}
