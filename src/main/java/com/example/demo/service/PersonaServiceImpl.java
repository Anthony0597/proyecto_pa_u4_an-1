package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
import com.example.demo.repo.IPersonaRepo;
@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	IPersonaRepo personaRepo;
	
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepo.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepo.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.personaRepo.eliminar(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.personaRepo.buscar();
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.personaRepo.buscarPorId(id);
	}

}
