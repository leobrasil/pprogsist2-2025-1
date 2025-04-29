package br.mackenzie.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import br.mackenzie.ps2.agendamento.model.*;
import br.mackenzie.ps2.agendamento.repository.*;
import java.util.*;



@Service
public class PacienteService {

    @Autowired
    private PacienteRepo dao;

    public List<Paciente> getAllPacientes(){
        
        return this.dao.findAll();
    }
}
