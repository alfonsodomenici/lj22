/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.web;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ospite
 */
@Path("/clienti")
public class AnagraficaResource {
    
    @Inject
    AnagraficaStore store;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Anagrafica> all(){
        return store.all();
    }
}
