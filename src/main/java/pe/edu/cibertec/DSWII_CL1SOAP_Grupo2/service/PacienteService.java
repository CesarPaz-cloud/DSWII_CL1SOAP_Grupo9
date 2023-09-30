package pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo2.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerPacientes(){return pacienteRepository.findAll();}

    public  Paciente obtenerPacienteXId(Integer id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);

        if (paciente.isEmpty()){
            return null;
        }
        return paciente.get();
    }

    public Paciente guardar(Paciente paciente){return pacienteRepository.save(paciente);}
}
