package com.cleycianefarias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleycianefarias.cursomc.domain.Cliente;
import com.cleycianefarias.cursomc.repositories.ClienteRepository;
import com.cleycianefarias.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
}
