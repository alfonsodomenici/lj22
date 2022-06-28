/*
Si lancia un dado finché escono consecutivamente 5 facce uguali;
Visualizzare il numero dei lanci che sono stati
necessari ed il valore che si è ripetuto. 

start
    
    numeroAttuale=lancia dado;
    consecutivi=1;
    numeroLanci=1
    while(consecutivi<5)do
        numero=lancia dado;
        if(numeroAttuale==numero)then
            consecutivi++;
        else
            numeroAttuale = numero;
            consecutivi=1;
        end if
        numeroLanci++;
    end while
    stampa numeroLanci;
    stampa numeroAttuale;

end
 */
package it.corsojava.dadi.sequenza;

import java.util.Random;

/**
 *
 * @author java
 */
public class App {

    public static void main(String[] args) {
        int numeroAttuale = lanciaDado();
        int consecutivi = 1;
        int numeroLanci = 1;
        while (consecutivi < 5) {
            int numero = lanciaDado();
            if (numeroAttuale == numero) {
                consecutivi++;
            } else {
                numeroAttuale = numero;
                consecutivi = 1;
            }
            numeroLanci++;
        }
        System.out.println("Numero lanci: " + numeroLanci);
        System.out.println("per ottenere 5 volte: " + numeroAttuale);
    }

    private static int lanciaDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
