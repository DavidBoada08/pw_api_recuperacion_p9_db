package uce.edu.ec.api.Infraestruture;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.api.Domain.Paciente;

@ApplicationScoped
public class PacienteRepository implements PanacheRepository<Paciente>{
    
}
