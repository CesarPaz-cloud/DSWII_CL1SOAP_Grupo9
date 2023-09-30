package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

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
    public String nomPaci;
    @Column(name = "ApepPaciente")
    public String apePaci;
    @Column(name = "DocPaciente")
    public String docPaci;
    @Column(name = "FecNacPaciente")
    public Date fecnac;
    @Column(name = "EmailPaciente")
    public String correo;
}
