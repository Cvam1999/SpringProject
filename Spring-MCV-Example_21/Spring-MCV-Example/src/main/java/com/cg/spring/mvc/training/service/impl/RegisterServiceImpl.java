package com.cg.spring.mvc.training.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.mvc.training.models.Register;
import com.cg.spring.mvc.training.repository.RegisterRespository;
import com.cg.spring.mvc.training.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private RegisterRespository registerRespository;

	
	public Register registerUer(Register register) {
		registerRespository.save(register);
		return register;
	}

}
