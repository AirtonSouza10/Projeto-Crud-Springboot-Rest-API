package com.cursospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursospringboot.model.Cargo;

@Repository
@Transactional
public interface CargoRepository extends JpaRepository<Cargo, Long>{

	
}
