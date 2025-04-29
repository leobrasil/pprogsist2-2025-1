package br.mackenzie.ps2.agendamento.repository;

import org.springframework.data.repository.CrudRepository;
import br.mackenzie.ps2.agendamento.model.*;
import java.util.*;


public interface PacienteRepo extends CrudRepository<Paciente, Long> {

    
    @Override
    List<Paciente> findAll();

}
