package uce.edu.ec.api.Aplications;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.xml.bind.annotation.XmlRootElement;
import uce.edu.ec.api.Aplications.Representation.PacienteRepresentation;
import uce.edu.ec.api.Domain.Paciente;
import uce.edu.ec.api.Infraestruture.PacienteRepository;

@ApplicationScoped
@XmlRootElement
@Transactional
public class PacienteServices {

    @Inject
    private PacienteRepository pacienteRepository;

    //mappeer
    public Paciente mapperDesdeRepresentacion(PacienteRepresentation pacienteRep) {
        Paciente paciente = new Paciente();
        paciente.setId(pacienteRep.getId());
        paciente.setNombre(pacienteRep.getNombre());
        paciente.setApellido(pacienteRep.getApellido());
        paciente.setDireccion(pacienteRep.getDireccion());
        paciente.setFechaNacimiento(pacienteRep.getFechaNacimiento());
        
        return paciente;
    }

    public PacienteRepresentation mapper(Paciente paci){
        PacienteRepresentation paciRE= new PacienteRepresentation();

        paciRE.setId(paci.getId());
        paciRE.setNombre(paci.getNombre());
        paciRE.setApellido(paci.getApellido());
        paciRE.setDireccion(paci.getDireccion());
        paciRE.setFechaNacimiento(paci.getFechaNacimiento());

        return paciRE;
    }

    //consultar todo los pacientes en la base de datos
    public List<PacienteRepresentation> consultarTodos() {

        return pacienteRepository.listAll()
                .stream()
                .map(this::mapper)
                .toList();
    }

   


    
    

    
}
