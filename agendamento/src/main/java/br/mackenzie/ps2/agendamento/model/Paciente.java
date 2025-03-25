package br.mackenzie.ps2.agendamento.model;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Paciente {
    @Id
    private long id;
    private String nome;
    
    public Paciente(Long id, String nome){
        this.id = id;
        this.nome=nome;
    }

    public void setId(long id){
        this.id =id;
    }

    public long getId(){return this.id;}

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){return this.nome;}

    


}
