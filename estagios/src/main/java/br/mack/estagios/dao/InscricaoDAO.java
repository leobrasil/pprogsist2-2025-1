package br.mack.estagios.dao;

import org.springframework.data.repository.CrudRepository;

import br.mack.estagios.model.Empresa;
import br.mack.estagios.model.Inscricao;

public interface InscricaoDAO extends CrudRepository<Inscricao, Long>{

}
