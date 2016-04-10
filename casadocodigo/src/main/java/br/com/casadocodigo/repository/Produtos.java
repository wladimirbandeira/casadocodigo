package br.com.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.casadocodigo.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long>{
	
	
}
