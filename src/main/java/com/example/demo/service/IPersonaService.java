package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Persona;

public interface IPersonaService {
	public void guardar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public List<Persona> buscarTodos();
	public Persona buscarPorId(Integer id);
}
