package br.mackenzie.ps2.agendamento.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Clinica {
    @Id @GeneratedValue
    private long id;
    private String nome;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Paciente> pacientes = new ArrayList<>();

    public Clinica(){}

    public void addPaciente(Paciente p){
        this.pacientes.add(p);
    }

    public List<Paciente>getPacientes(){
        return this.pacientes;
    }

    public Clinica(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
}


