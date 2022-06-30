/*
Caricare un array con i primi 100 dispari e stamparlo

start
    //caricamento array
    numeriDispari[100];
    indice = 0;
    numero = 0;
    while(indice < 100)do
        if(numero%2!=0)then
            numeriDispari[indice]=numero;
            indice++;
        end if
        numero++;
    end while

    stampa numeriDispari;
end

 */
package it.corsojava.array;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti numeri dispari vuoi memorizzare e stampare? ");
        int max = scanner.nextInt();
        
        int[] numeriDispari = carica(max);
        
        stampa(numeriDispari);
    }

    private static int[] carica(int max){
        int[] risultato = new int[max];
        int indice = 0;
        int numero = 0;
        while (indice < risultato.length) {
            if (numero % 2 != 0) {
                risultato[indice] = numero;
                indice++;
            }
            numero++;
        }
        return risultato;
    }
    
    private static void stampa(int[] array) {
        int indice = 0;
        while (indice < array.length) {
            System.out.println(array[indice]);
            indice++;
        }
    }
}
