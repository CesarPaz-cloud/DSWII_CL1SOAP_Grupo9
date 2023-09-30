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
    @Column(name = "IdPaciente")
    private Integer idPaciente;

    @Column(name = "NomPaciente")
    private String nomPaciente;

    @Column(name = "ApePaciente")
    private String apePaciente;

    @Column(name = "DocPaciente")
    private String docPaciente;

    @Column(name = "FecNacPaciente")
    @Temporal(TemporalType.DATE)
    private Date fecNacPaciente;

    @Column(name = "EmailPaciente")
    private String emailPaciente;
}

