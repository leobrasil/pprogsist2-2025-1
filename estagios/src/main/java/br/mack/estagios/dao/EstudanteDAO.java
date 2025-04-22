package br.mack.estagios.dao;

import org.springframework.data.repository.CrudRepository;

import br.mack.estagios.model.Estudante;

public interface EstudanteDAO extends CrudRepository<Estudante, Long>{

    public Estudante findEstudanteByCPF(String cpf);

}
