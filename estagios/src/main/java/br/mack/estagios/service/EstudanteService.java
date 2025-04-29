package br.mack.estagios.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.mack.estagios.dao.EstudanteDAO;
import br.mack.estagios.model.Estudante;

public class EstudanteService {
    @Autowired
    private EstudanteDAO estudanteDAO;

    public void create(Estudante e){
        if(e.getCpf() != null & !e.getCpf().equalsIgnoreCase("")){
            estudanteDAO.save(e);
        }
    }

    public Estudante findEstudanteByCPF(String cpf){
        return estudanteDAO.findEstudanteByCPF(cpf);
    }
    
    public long getTotalEstudantes(){
        return estudanteDAO.count();
    }
}
