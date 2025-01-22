package service;

import dominio.Comune;
import java.util.*;
import javax.ejb.Stateless;
import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Stateless
@Path("comune")
public class ComuneFacadeREST extends AbstractFacade<Comune> {
    @PersistenceContext(unitName = "RicercaComuniPU")
    private EntityManager em;

    public ComuneFacadeREST() {
        super(Comune.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Comune entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Comune entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Comune find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Comune> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Comune> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @POST
    @Path("setDB")
    @Consumes(MediaType.TEXT_PLAIN)
    public void setDB(String comuni) {
        ArrayList<Comune> lista = new ArrayList<>();
        String[] arrayComune = comuni.split("\n");
        for (String linea : arrayComune) {
            String[] parola = linea.split(";");
            lista.add(new Comune(parola[0], parola[1], parola[2], parola[3], parola[4], parola[5], parola[6], parola[7], parola[8]));
        }
        lista.forEach((comune) -> {
            em.persist(comune);
            
        });
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response doGetElencoComune(@QueryParam("inizia") String inizia) {
        List<Comune> comuni;
        if (inizia.equals("")) {
            return Response.ok("EMPTY").build();
        } else if (inizia.matches("[0-9]{1,5}")) {
            comuni = em.createNamedQuery("Comune.inizialePerCAP").setParameter("cap", inizia + "%").getResultList();
        } else if (inizia.matches("[a-zA-Z]{2}")) {
            comuni = em.createNamedQuery("Comune.inizialePerProvincia").setParameter("provincia", inizia + "%").getResultList();
        } else if (inizia.matches("[a-zA-Z]{1} [0-9]{0,3}")) {
            comuni = em.createNamedQuery("Comune.inizialePerIstat").setParameter("istat", inizia + "%").getResultList();
        } else {
            inizia = inizia.substring(0, 1).toUpperCase() + inizia.substring(1);
            comuni = em.createNamedQuery("Comune.inizialePerComune").setParameter("comune", inizia + "%").getResultList();
        }
        
        String stampa = "";
        for (Comune c : comuni) {
            stampa += c.getComune() + " " + c.getProvincia() + " " + c.getCap() + " " + c.getIstat() + "\n";
        }
        if (stampa.equals("")) {
            stampa = "NO RESULTS";
        }
        
        return Response.ok(stampa.getBytes()).status(200).build();
    }
}