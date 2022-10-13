/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.web;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author ospite
 */
@Named("store")
@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class AnagraficaStore {

    @PersistenceContext(name = "pu")
    private EntityManager em;

    /**
     * salva una anagrafica su database
     *
     * @param a
     * @return
     */
    public  Anagrafica save(Anagrafica a) {
        Anagrafica result = em.merge(a);
        return result;
    }

    /**
     * ritorna tutte le anagrafiche presenti nel database
     *
     * @return
     */
    public  List<Anagrafica> all() {
        return em.createQuery("select e from Anagrafica e", Anagrafica.class)
                .getResultList();
    }

    /**
     * rimuove un cliente tramide il suo id
     *
     * @param id
     */
    public  void delete(Long id) {
        Anagrafica todelete = em.find(Anagrafica.class, id);
        em.remove(todelete);
    }

    public  Anagrafica find(Long id) {
        return em.find(Anagrafica.class, id);
    }
}
