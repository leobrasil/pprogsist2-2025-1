package br.mackenzie.ps2.agendamento.model;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;


@Entity
@Table
public class Paciente {
    @Id @GeneratedValue
    private long id;
    private String nome;

    public Paciente() {}
    
    public Paciente( String nome){
        
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
