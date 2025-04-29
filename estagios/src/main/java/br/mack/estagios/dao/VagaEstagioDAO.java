package br.mack.estagios.dao;

import org.springframework.data.repository.CrudRepository;

import br.mack.estagios.model.Empresa;
import br.mack.estagios.model.VagaEstagio;

public interface VagaEstagioDAO extends CrudRepository<VagaEstagio, Long>{

}
