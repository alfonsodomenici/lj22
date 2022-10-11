/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.jpa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author ospite
 */
public class DateFunctions {

    private DateFunctions() {
    }

    public static LocalDate toLocalDate(Date d) {
        if (d == null) {
            return null;
        }
        Instant toInstant = d.toInstant();
        return LocalDate.ofInstant(toInstant, ZoneId.systemDefault());
    }

    public static Date toDate(LocalDate d) {
        if (d == null) {
            return null;
        }
        return Date.from(d.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
