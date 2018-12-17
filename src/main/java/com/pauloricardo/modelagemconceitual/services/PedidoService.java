package com.pauloricardo.modelagemconceitual.services;

 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.modelagemconceitual.domain.Pedido;
import com.pauloricardo.modelagemconceitual.repositories.PedidoRepository;
import com.pauloricardo.modelagemconceitual.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;	

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objecto Não Encontrado !! Id: " + id + ", Tipo: " + Pedido.class.getName()));		
	}

}
