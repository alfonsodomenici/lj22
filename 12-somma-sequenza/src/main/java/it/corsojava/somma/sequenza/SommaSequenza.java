/*
Esercizio 1.6
Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo
della somma di una sequenza di interi fornita in ingresso dall’utente. 
Si supponga che l’inserimento di 0 indichi il
termine della sequenza.

start
    leggi numero;
    somma = 0;
    while(numero!=0)do
        somma = somma + numero;
        leggi numero;
    end while
    stampa somma
end

 */
package it.corsojava.somma.sequenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class SommaSequenza {

    
    
    public static void main(String[] args) {
        List<Integer> numeriInseriti = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero intero");
        int numero = scan.nextInt();
        int somma = 0;
        while (numero!=0) {      
            numeriInseriti.add(numero);
            System.out.println("Il numero è corretto (true/false)");
            boolean ok = scan.nextBoolean();
            if(ok == false){
                numeriInseriti.remove(numeriInseriti.size()-1);
            }else{
                somma = somma + numero;
            }
            System.out.println("inserisci un numero intero");
            numero = scan.nextInt();
        }
        System.out.println("Hai inserito: " + numeriInseriti);
        System.out.println("la somma è: " + somma);
        
    }

}
