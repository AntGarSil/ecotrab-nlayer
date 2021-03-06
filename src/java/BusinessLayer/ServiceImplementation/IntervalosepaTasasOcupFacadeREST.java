/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.ServiceImplementation;

import DataLayer.Entities.IntervalosepaTasasOcup;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;

/**
 *
 * @author PC
 */
@Stateless
@Path("datalayer.entities.intervalosepatasasocup")
public class IntervalosepaTasasOcupFacadeREST extends AbstractFacade<IntervalosepaTasasOcup> {
    @PersistenceContext(unitName = "ecotrab-finalPU")
    private EntityManager em;

    public IntervalosepaTasasOcupFacadeREST() {
        super(IntervalosepaTasasOcup.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(IntervalosepaTasasOcup entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(IntervalosepaTasasOcup entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public IntervalosepaTasasOcup find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<IntervalosepaTasasOcup> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<IntervalosepaTasasOcup> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @java.lang.Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
