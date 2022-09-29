/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.oo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ospite
 */
public class UsaAnagrafica {

    public static void main(String[] args) {

        Path path = Paths.get("/home/ospite/Documenti/persone.txt");

        try {
            
            String s = "messaggio da Java";
            
            Files.write(Paths.get("/home/ospite/Documenti/scrivi.txt"), s.getBytes(), 
                    StandardOpenOption.CREATE);
            
            List<String> righe = Files.readAllLines(path);

            stampa(righe);

            List<Anagrafica> persone = new ArrayList<>();

            for (String riga : righe) {
                String[] split = riga.split(",");
                LocalDate dNascita = LocalDate.parse(split[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Anagrafica p = new Anagrafica(split[0], split[1], dNascita);
                persone.add(p);
            }

            System.out.println("------------- lista anagrafica");

            persone.forEach(v -> System.out.println(v.toString()));

            Anagrafica a = new Anagrafica("mario", "rossi", LocalDate.of(2000, Month.OCTOBER, 22));
            
            System.out.println(persone.contains(a));
            
        }catch (IOException ex) {
            System.out.println("Scusa ma il file non esiste più...");
        }

    }

    private static void stampa(List<String> righe) {
        System.out.println("------------- method reference");

        righe.forEach(System.out::println);

        System.out.println("------------- lambda");
        righe.forEach(v -> System.out.println(v));

        System.out.println("------------- for each");
        for (String v : righe) {
            System.out.println(v);
        }

        System.out.println("------------- for old style");
        for (int i = 0; i < righe.size(); i++) {
            System.out.println(righe.get(i));
        }
    }
}
