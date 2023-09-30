package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.converter;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model.Paciente;
import pe.edu.cibertec.ws.objects.Pacientews;

import java.util.ArrayList;
import java.util.List;

@Component
public class PacienteConvert {

    public Paciente convertPacienteWsToPaciente(Pacientews pacientews){
        Paciente paciente = new Paciente();
        paciente.setIdpaci(pacientews.getIdPaciente());
        paciente.setNomPaci(pacientews.getNomPaciente());
        paciente.setApePaci(pacientews.getApePaciente());
        paciente.setDocPaci(pacientews.getDocPaciente());
        paciente.setFecnac(pacientews.getFechaNacPaciente());
        paciente.setCorreo(pacientews.getEmailPaciente());
        return paciente;
    }
    public Pacientews convertPacienteToPacienteWs(Paciente paciente){
        Pacientews pacientews = new Pacientews();
        pacientews.setIdPaciente(pacientews.getIdPaciente());
        pacientews.setApePaciente(pacientews.getNomPaciente());
        pacientews.setApePaciente(pacientews.getApePaciente());
        pacientews.setDocPaciente(pacientews.getDocPaciente());
        pacientews.setFechaNacPaciente(pacientews.getFechaNacPaciente());
        pacientews.setEmailPaciente(pacientews.getEmailPaciente());
        return pacientews;
    }
    public List<Paciente> convertPacoemteWsToPaciente(List<Pacientews> pacientewsList) {
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews: pacientewsList) {
            pacienteList.add(convertPacienteWsToPaciente(pacientews));
        }
        return pacienteList;
    }
    public List<Pacientews> convertPacienteToPacienteWs(List<Paciente> pacienteList) {
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente domicilio: pacienteList) {
            pacientewsList.add(convertPacienteToPacienteWs(domicilio));
        }
        return pacientewsList;
    }
}
