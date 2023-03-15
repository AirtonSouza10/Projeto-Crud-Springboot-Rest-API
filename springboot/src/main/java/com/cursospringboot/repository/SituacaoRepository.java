package com.cursospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursospringboot.model.Situacao;

@Repository
@Transactional
public interface SituacaoRepository extends JpaRepository<Situacao, Long>{

}
