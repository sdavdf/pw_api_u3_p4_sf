package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {
	
	public Materia buscarPorCodigo(String codigo);

	public void guardar(Materia materia);

}
