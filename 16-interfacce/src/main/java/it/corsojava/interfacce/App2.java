/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.interfacce;

/**
 *
 * @author ospite
 */
public class App2 {
    
    public static void main(String[] args) {
        
        test(() -> {
            System.out.println("sono la funzione lambda che implementa IBB");
        });
        
        test(App2::mm4Impl);
    }
    
    public static void test(IBB p){
        p.mm4();
    }
    
    private static void mm4Impl(){
        System.out.println("sono il metoddo che implementa IBB (method reference)");
    }
}
