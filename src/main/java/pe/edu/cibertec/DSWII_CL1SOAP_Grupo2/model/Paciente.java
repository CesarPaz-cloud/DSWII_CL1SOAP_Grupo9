package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idpaci;
    @Column(name = "NomPaciente")
    public String NomPaciente;
    @Column(name = "ApepPaciente")
    public String ApepPaciente;
    @Column(name = "DocPaciente")
    public String DocPaciente;
    @Column(name = "FecNacPaciente")
    public Date FecNacPaciente;
    @Column(name = "EmailPaciente")
    public String EmailPaciente;



}
