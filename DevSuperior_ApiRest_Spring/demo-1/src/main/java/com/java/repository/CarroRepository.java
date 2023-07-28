package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
