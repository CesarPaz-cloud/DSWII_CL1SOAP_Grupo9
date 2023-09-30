package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.converter.PacienteConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.repository.PacienteRepository;

import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model.Paciente;
import pe.edu.cibertec.ws.objects.*;

import java.util.List;

@Endpoint
public class PacienteEndPoint {
    private static final String NAMESPACE_URI = "";

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private PacienteConvert pacienteConvert;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPacientesRequest")
    @ResponsePayload
    public GetPacientesResponse getPacientes(@RequestPayload GetPacientesRequest request){

        GetPacientesResponse response = new GetPacientesResponse();
        List<Pacientews> pacientewsList = pacienteConvert.convertPacienteToPacienteWs(pacienteRepository.findAll());
        response.getPacientes().addAll(pacientewsList);

        return response;
    }



}