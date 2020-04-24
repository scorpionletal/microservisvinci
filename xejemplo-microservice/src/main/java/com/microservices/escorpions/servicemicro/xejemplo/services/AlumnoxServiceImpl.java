package com.microservices.escorpions.servicemicro.xejemplo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.escorpions.servicemicro.xejemplo.models.entity.Alumnox;
import com.microservices.escorpions.servicemicro.xejemplo.models.repository.AlumnoxRepository;

public class AlumnoxServiceImpl implements AlumnoxService {
	
	@Autowired
	protected AlumnoxRepository service;

	@Override
	public Iterable<Alumnox> findAll() {
		
		return service.findAll();
	}

	@Override
	public Optional<Alumnox> findById(Long id) {
		
		return service.findById(id);
	}

	@Override
	public Alumnox save(Alumnox alumnox) {
		
		return service.save(alumnox);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
	}

}
