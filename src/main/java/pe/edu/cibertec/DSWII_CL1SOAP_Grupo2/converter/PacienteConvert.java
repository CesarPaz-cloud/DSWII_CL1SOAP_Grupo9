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
        paciente.setIdPaciente(pacientews.getIdPaciente());
        paciente.setNomPaciente(pacientews.getNomPaciente());
        paciente.setApePaciente(pacientews.getApePaciente());
        paciente.setDocPaciente(pacientews.getDocPaciente());
        paciente.setFecNacPaciente(pacientews.getFechaNacPaciente());
        paciente.setEmailPaciente(pacientews.getEmailPaciente());
        return paciente;
    }
    public Pacientews convertPacienteToPacienteWs(Paciente paciente){
        Pacientews pacientews = new Pacientews();
        pacientews.setIdPaciente(paciente.getIdPaciente());
        pacientews.setApePaciente(paciente.getNomPaciente());
        pacientews.setApePaciente(paciente.getApePaciente());
        pacientews.setDocPaciente(paciente.getDocPaciente());
        pacientews.setFechaNacPaciente(paciente.getFecNacPaciente());
        pacientews.setEmailPaciente(paciente.getEmailPaciente());
        return pacientews;
    }
    public List<Paciente> convertPacienteWsToPaciente(List<Pacientews> pacientewsList) {
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews: pacientewsList) {
            pacienteList.add(convertPacienteWsToPaciente(pacientews));
        }
        return pacienteList;
    }
    public List<Pacientews> convertPacienteToPacienteWs(List<Paciente> pacienteList) {
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente paciente: pacienteList) {
            pacientewsList.add(convertPacienteToPacienteWs(paciente));
        }
        return pacientewsList;
    }
}
