package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idpaciente;
    @Column(name = "nompaciente")
    public String nompaciente;
    @Column(name = "apepaciente")
    public String apepaciente;
    @Column(name = "docpaciente")
    public String docpaciente;
    @Column(name = "fechanacpaciente")
    public Date fechanacpaciente;
    @Column(name = "emailpaciente")
    public String emailpaciente;
}

