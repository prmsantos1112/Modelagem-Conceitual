package com.pauloricardo.modelagemconceitual.services;

 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.modelagemconceitual.domain.Cliente;
import com.pauloricardo.modelagemconceitual.repositories.ClienteRepository;
import com.pauloricardo.modelagemconceitual.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;	

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objecto Não Encontrado !! Id: " + id + ", Tipo: " + Cliente.class.getName()));		
	}

}
