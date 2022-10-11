/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ospite
 */
public class AnagraficaStore {

    private static final EntityManager em;

    private AnagraficaStore() {
    }

    //costruttore statico
    static {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        em = emf.createEntityManager();
    }

    /**
     * salva una anagrafica su database
     *
     * @param a
     * @return
     */
    public static Anagrafica save(Anagrafica a) {
        em.getTransaction().begin(); //inizia una transazione di modifiche
        Anagrafica result = em.merge(a);
        em.getTransaction().commit();
        return result;
    }

    /**
     * ritorna tutte le anagrafiche presenti nel database
     *
     * @return
     */
    public static List<Anagrafica> all() {
        return em.createQuery("select e from Anagrafica e", Anagrafica.class)
                .getResultList();
    }

    /**
     * rimuove un cliente tramide il suo id
     *
     * @param id
     */
    public static void delete(Long id) {
        em.getTransaction().begin();
        Anagrafica todelete = em.find(Anagrafica.class, id);
        em.remove(todelete);
        em.getTransaction().commit();
    }

    public static Anagrafica find(Long id) {
        return em.find(Anagrafica.class, id);
    }
}
