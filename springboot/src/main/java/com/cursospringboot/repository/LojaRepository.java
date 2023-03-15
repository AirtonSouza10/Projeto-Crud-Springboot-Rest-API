package com.cursospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursospringboot.model.Loja;

@Repository
@Transactional
public interface LojaRepository extends JpaRepository<Loja, Long>{

}
