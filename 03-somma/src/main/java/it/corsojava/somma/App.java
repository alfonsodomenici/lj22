package it.corsojava.somma;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("start programma somma");
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int x = scan.nextInt();
        System.out.println("inserisci il secondo numero");
        int y = scan.nextInt();
        int somma = x + y;
        System.out.println("la somma è:");
        System.out.println(somma);
        System.out.println("fine programma somma");
        
    }
}
