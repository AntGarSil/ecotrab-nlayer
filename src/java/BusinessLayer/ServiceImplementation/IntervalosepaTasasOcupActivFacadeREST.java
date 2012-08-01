/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.ServiceImplementation;

import DataLayer.Entities.IntervalosepaTasasOcupActiv;
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
@Path("datalayer.entities.intervalosepatasasocupactiv")
public class IntervalosepaTasasOcupActivFacadeREST extends AbstractFacade<IntervalosepaTasasOcupActiv> {
    @PersistenceContext(unitName = "ecotrab-finalPU")
    private EntityManager em;

    public IntervalosepaTasasOcupActivFacadeREST() {
        super(IntervalosepaTasasOcupActiv.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(IntervalosepaTasasOcupActiv entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(IntervalosepaTasasOcupActiv entity) {
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
    public IntervalosepaTasasOcupActiv find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<IntervalosepaTasasOcupActiv> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<IntervalosepaTasasOcupActiv> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
