package services;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Doctor;
import repositories.RepositoryDoctor;

@Path("/doctores")
public class ServiceDoctores {

    RepositoryDoctor repo;

    public ServiceDoctores() {
        this.repo = new RepositoryDoctor();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Doctor> getDoctores() throws SQLException {
        return this.repo.getDoctores();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Doctor getDoctor(@PathParam("id") String id) throws SQLException {
        int iddoctor = Integer.parseInt(id);
        return this.repo.BuscarDoctor(iddoctor);
    }

    //cualquier metodo que tengamos debe ser escrito con path
    //Solamente podemos tener un get por defeecto
    @GET
    @Path("buscarsalario/{salario}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Doctor> getDoctoresSalario(@PathParam("salario") String salario) throws SQLException {
        int sal = Integer.parseInt(salario);
        return this.repo.getDoctoresSalario(sal);
    }
}
