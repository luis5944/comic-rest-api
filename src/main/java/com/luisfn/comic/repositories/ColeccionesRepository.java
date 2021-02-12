package com.luisfn.comic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisfn.comic.entities.Coleccion;

@Repository
public interface ColeccionesRepository extends JpaRepository<Coleccion, Long> {

}
