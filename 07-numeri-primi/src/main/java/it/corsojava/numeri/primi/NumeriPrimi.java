/*
Dato in input un numero n, stampare tutti i numeri primi compresi
tra 1 ed n

start
    leggi n;
    numero = 2
    while (numero <= n)do
        if(numero è primo)then
            stampa numero
        end if
        numero += 1
    end while
end

sotto problema: dato un numero in input dire se è primo (true/false)
start
    leggi numero;
    if(numero<=1)then
        return false;
    end if
    primo = true;
    divisore = 2;
    while(divisore<numero and primo==true)do{
        if(numero%divisore==0)then
            primo = false;
        end if
        divisore+=1;
    }
    return primo;
end


 */
package it.corsojava.numeri.primi;
import it.corsojava.numeri.primi.utilita.Utilita;
import it.corsojava.libreria.numeri.Numeri;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class NumeriPrimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero: ");
        int n = scanner.nextInt();
        int numero = 2;
        System.out.println("Elenco numeri primi maggiori di 1 fino a " + n);
        while (numero <= n) {
            /* primo modo
            if (isNumeroPrimo1(numero) == true) {
                System.out.println(numero);
            }
            */
            /* secondo modo
            if (Utilita.isNumeroPrimo2(numero) == true) {
                System.out.println(numero);
            }
            */
            //terzo modo
            if (Numeri.isNumeroPrimo(numero) == true) {
                System.out.println(numero);
            }
            numero++;
        }
    }
    
    public static boolean isNumeroPrimo1(int numero) {
        if (numero < 2) {
            return false;
        }
        boolean primo = true;
        int divisore = 2;
        while (divisore < numero && primo == true) {
            if (numero % divisore == 0) {
                primo = false;
            }
            divisore++;
        }
        return primo;
    }
    
    
}
