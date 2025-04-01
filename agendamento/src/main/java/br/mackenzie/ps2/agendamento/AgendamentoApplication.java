package br.mackenzie.ps2.agendamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.mackenzie.ps2.agendamento.model.Paciente;
import br.mackenzie.ps2.agendamento.repository.PacienteRepo;

@SpringBootApplication
public class AgendamentoApplication implements CommandLineRunner {

	@Autowired
	private PacienteRepo pacienteRepo;

	public static void main(String[] args) {
		SpringApplication.run(AgendamentoApplication.class, args);
	}

	public void createPaciente(){

		Paciente p = new Paciente( "joao");
		pacienteRepo.save(p);
	}

	public void listAllPacientes(){
		Iterable<Paciente> lista = pacienteRepo.findAll();

		for (Paciente paciente : lista) {
			System.out.println(paciente.getNome());
		}
	}

	public void run(String... args){
		createPaciente();
		listAllPacientes();
	}

}
