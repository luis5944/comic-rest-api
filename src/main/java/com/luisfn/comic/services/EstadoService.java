package com.luisfn.comic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfn.comic.entities.Estado;
import com.luisfn.comic.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {

		return estadoRepository.findAll();
	}
}
