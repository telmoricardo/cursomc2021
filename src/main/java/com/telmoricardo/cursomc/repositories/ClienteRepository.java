package com.telmoricardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telmoricardo.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
