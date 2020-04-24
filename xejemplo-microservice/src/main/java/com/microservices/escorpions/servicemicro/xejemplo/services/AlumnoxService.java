package com.microservices.escorpions.servicemicro.xejemplo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservices.escorpions.servicemicro.xejemplo.models.entity.Alumnox;

@Service
public interface AlumnoxService {
	
	public Iterable<Alumnox> findAll();
	
	public Optional<Alumnox> findById(Long id);
	
	public Alumnox save(Alumnox alumnox);
	
	public void deleteById(Long id);
}
