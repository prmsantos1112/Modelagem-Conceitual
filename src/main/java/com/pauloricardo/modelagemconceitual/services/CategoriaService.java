package com.pauloricardo.modelagemconceitual.services;

 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.modelagemconceitual.domain.Categoria;
import com.pauloricardo.modelagemconceitual.repositories.CategoriaRepository;
import com.pauloricardo.modelagemconceitual.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;	

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objecto Não Encontrado !! Id: " + id + ", Tipo: " + Categoria.class.getName()));		
	}

}
