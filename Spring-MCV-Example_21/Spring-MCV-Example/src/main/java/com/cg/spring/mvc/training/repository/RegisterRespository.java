package com.cg.spring.mvc.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.mvc.training.models.Register;

@Repository
public interface RegisterRespository extends JpaRepository<Register, Long> {

}
                       