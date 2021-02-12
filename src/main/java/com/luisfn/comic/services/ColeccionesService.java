package com.luisfn.comic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfn.comic.entities.Coleccion;
import com.luisfn.comic.repositories.ColeccionesRepository;

@Service
public class ColeccionesService {

	@Autowired
	private ColeccionesRepository coleccionesRepository;

	public List<Coleccion> findAll() {

		return coleccionesRepository.findAll();
	}

}
