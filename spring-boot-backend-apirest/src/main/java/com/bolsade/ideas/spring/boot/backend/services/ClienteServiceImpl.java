package com.bolsade.ideas.spring.boot.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsade.ideas.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.bolsade.ideas.spring.boot.backend.apirest.models.entity.Cliente;

//import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
//import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	

}
