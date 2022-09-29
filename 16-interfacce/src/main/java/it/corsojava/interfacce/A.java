/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public class A {

    private String p1;
    private String p2;

    public A(String p1, String p2) {
        this.p1 = p1;
        this.p2 = checkP2(p2);
    }

    
    public void m1(){
        System.out.println("sono il metodo m1 di A");
    }
    
    private String checkP2(String value){
        if (value.length() <= 4) {
            throw new IllegalArgumentException("p2 deve avere lunghezza minimo 5 caratteri");
        }
        return value;
    }
    
    /*
    getter / setter
    */
    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = checkP2(p2);
    }

   
    @Override
    public String toString() {
        return "A{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }

}
