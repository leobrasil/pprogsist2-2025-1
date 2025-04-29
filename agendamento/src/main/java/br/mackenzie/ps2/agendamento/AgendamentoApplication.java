package br.mackenzie.ps2.agendamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.mackenzie.ps2.agendamento.model.Clinica;
import br.mackenzie.ps2.agendamento.model.Paciente;
import br.mackenzie.ps2.agendamento.repository.ClinicaRepo;
import br.mackenzie.ps2.agendamento.repository.PacienteRepo;

@SpringBootApplication
public class AgendamentoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AgendamentoApplication.class, args);
	}
/*
	public void createClinica(){
		Clinica c = new Clinica("Clinica Corinthians campeao !!!!");
		clinicaRepo.save(c);
	}

	public void createPaciente(){

		Paciente p = new Paciente( "joao");
		pacienteRepo.save(p);

		p = new Paciente( "maria");
		pacienteRepo.save(p);
	}

	public void listAllPacientes(){
		Iterable<Paciente> lista = pacienteRepo.findAll();

		for (Paciente paciente : lista) {
			System.out.println(paciente.getNome());
		}
	}

	public void cadastraPaciente(){
		Iterable<Paciente> lista = pacienteRepo.findAll();
		Clinica c = clinicaRepo.findById(1L).get();

		for (Paciente paciente : lista) {
			c.addPaciente(paciente);
		}
		clinicaRepo.save(c);
	}

	public void listaPacientesClinica(Long clinicaId){
		Clinica c = clinicaRepo.findById(clinicaId).get();
		List<Paciente> pacientes = c.getPacientes();

		for (Paciente paciente : pacientes) {
			System.out.println("Pacientes da clinica: "+paciente.getNome());
		}
	} */

}
