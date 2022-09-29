/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public class B extends A implements IAA,IBB{

    private String p3;
    
    public B(String p1, String p2, String p3) {
        super(p1, p2);
        this.p3 = p3;
    }

    @Override
    public void m1() {
       System.out.println("sono il metodo m1 di B");
    }

    public void m2(){
        System.out.println("sono il metodo m2 di B");
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

    /*
    implementazione dell'interfaccia IAA
    */
    @Override
    public void mm1(int n1, int n2) {
        System.out.println("sono il metodo mm1 di B");
    }

    @Override
    public String mm2() {
        return "sono il metodo mm2 di B";
    }

    @Override
    public void mm3() {
        System.out.println("sono il metodo mm3 di B");
    }

    @Override
    public void mm4() {
        System.out.println("sono il metodo mm4 di B");
    }
      
    
}
