package br.mackenzie.ps2.agendamento.repository;

import org.springframework.data.repository.CrudRepository;
import br.mackenzie.ps2.agendamento.model.*;

public interface PacienteRepo extends CrudRepository<Paciente, Long> {

}
