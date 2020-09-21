package com.bolsade.ideas.spring.boot.backend.services;

import java.util.List;


import com.bolsade.ideas.spring.boot.backend.apirest.models.entity.Cliente;


public interface IClienteService {

	public List<Cliente> findAll();
}
