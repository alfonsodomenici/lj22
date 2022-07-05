/*
Memorizzare in una lista la sequenza di parole fornite in input dall'utente fino
all'inserimento della parola fine.
Fornire in output la parola più lunga e la più corta

start
    leggi parola
    lista=vuota;
    while(parola!="fine")do
        aggiungere parola a lista;
        leggi parola;
    end while
    parolaMax="";
    parolaMin="";
    while(esiste un elemento da leggere)do
        leggi elemento;
        if(numero caratteri elemento > numero caratteri parolaMax)then
            parolaMax = elemento; 
        end if
        if(numero caratteri elemento < numero caratteri parolaMin or (parolaMin=="") )then
            parolaMin = elemento; 
        end if
    end while
    

end


 */
package it.corsojava.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author java
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String parola = scanner.nextLine();
        List<String> lista = new ArrayList<>();
        while (!parola.equals("fine")) {
            lista.add(parola);
            System.out.println("Inserisci una parola");
            parola = scanner.nextLine();
        }
        System.out.println("le parole inserite sono: " + lista);

        System.out.println("----------- stampa elementi con for----------------");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println("----------- stampa elementi con iterator----------------");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

        System.out.println("----------- stampa elementi con foreach----------------");
        lista.forEach(elemento -> {
            System.out.println(elemento);
        });
        
        System.out.println("La parola più lunga è: " + Insiemi.parolaPiuLunga(lista));
        
        System.out.println("La parola più corta è: " + Insiemi.parolaPiuCorta(lista));
        
        System.out.println("inserisci la parola da ricercare:");
        parola = scanner.nextLine();
        
        System.out.println("trovata: " + Insiemi.trova(lista, parola));
    }
}
