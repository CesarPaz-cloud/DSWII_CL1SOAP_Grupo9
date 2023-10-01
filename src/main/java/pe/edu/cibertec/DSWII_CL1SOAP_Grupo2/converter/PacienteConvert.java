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
        paciente.setIdpaciente(pacientews.getIdPaciente());
        paciente.setNompaciente(pacientews.getNomPaciente());
        paciente.setApepaciente(pacientews.getApePaciente());
        paciente.setDocpaciente(pacientews.getDocPaciente());
        paciente.setFechanacpaciente(pacientews.getFechaNacPaciente());
        paciente.setEmailpaciente(pacientews.getEmailPaciente());
        return paciente;
    }
    public Pacientews convertPacienteToPacienteWs(Paciente paciente){
        Pacientews pacientews = new Pacientews();
        pacientews.setIdPaciente(paciente.getIdpaciente());
        pacientews.setApePaciente(paciente.getNompaciente());
        pacientews.setApePaciente(paciente.getApepaciente());
        pacientews.setDocPaciente(paciente.getDocpaciente());
        pacientews.setFechaNacPaciente(paciente.getFechanacpaciente());
        pacientews.setEmailPaciente(paciente.getEmailpaciente());
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
