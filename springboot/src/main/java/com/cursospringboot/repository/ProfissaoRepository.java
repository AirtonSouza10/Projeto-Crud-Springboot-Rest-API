package com.cursospringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursospringboot.model.Profissao;


@Transactional
@Repository
public interface ProfissaoRepository extends CrudRepository<Profissao, Long>{

	
	
}
