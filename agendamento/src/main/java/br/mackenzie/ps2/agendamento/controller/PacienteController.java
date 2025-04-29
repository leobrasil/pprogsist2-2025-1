package br.mackenzie.ps2.agendamento.controller;

import java.util.List;

import br.mackenzie.ps2.agendamento.model.Paciente;
import br.mackenzie.service.PacienteService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import br.mackenzie.ps2.agendamento.model.*;
import java.util.*;


@RestController
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping("/api/pacientes")
    public List<Paciente> getAllPacientes(){
        return service.getAllPacientes();
    }

}
