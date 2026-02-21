package uce.edu.ec.api.Domain;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.Panache;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
@SequenceGenerator(name = "pacientesSeq", sequenceName = "pacientes_seq", allocationSize = 1)

public class Paciente extends Panache {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pacientesSeq")
    
    private Integer id;

    private String nombre;

    private String apellido;

    private String direccion;

    private LocalDate fechaNacimiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    




}
