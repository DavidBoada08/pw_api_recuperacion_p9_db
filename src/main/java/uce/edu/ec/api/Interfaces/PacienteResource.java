package uce.edu.ec.api.Interfaces;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.xml.bind.annotation.XmlRootElement;
import uce.edu.ec.api.Aplications.PacienteServices;
import uce.edu.ec.api.Aplications.Representation.PacienteRepresentation;

@XmlRootElement
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/pacientes")
public class PacienteResource {

    @Inject
    private PacienteServices pacienteServices;

    @GET
    @Path("")
    public List<PacienteRepresentation> listaPacientes(){
        return this.pacienteServices.consultarTodos();
    }
    
}
