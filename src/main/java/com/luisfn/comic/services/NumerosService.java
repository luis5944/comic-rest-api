package com.luisfn.comic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfn.comic.entities.Numero;
import com.luisfn.comic.repositories.NumerosRepository;

@Service
public class NumerosService {

	@Autowired
	private NumerosRepository numerosRepository;

	public List<Numero> findAll() {

		return numerosRepository.findAll();
	}

	public List<Numero> ultimosNumerosAdquiridos() {
		/*
		 * List<Numero> numeros =
		 * numerosRepository.ultimosNumerosAdquiridos().stream().map(n -> { Calendar c =
		 * Calendar.getInstance(); c.setTime(n.getFechaAdquisicion());
		 * c.add(Calendar.DATE, 1); n.setFechaAdquisicion(c.getTime()); return n;
		 * }).collect(Collectors.toList());
		 */

		return numerosRepository.ultimosNumerosAdquiridos();
	}

	public List<Numero> numerosMasCaros() {
		/*
		 * List<Numero> numeros = numerosRepository.numerosMasCaros().stream().map(n ->
		 * { Calendar c = Calendar.getInstance(); c.setTime(n.getFechaAdquisicion());
		 * c.add(Calendar.DATE, 1); n.setFechaAdquisicion(c.getTime()); return n;
		 * }).collect(Collectors.toList());
		 */

		return numerosRepository.numerosMasCaros();
	}
}
