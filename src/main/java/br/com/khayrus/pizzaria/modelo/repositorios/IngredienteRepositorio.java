package br.com.khayrus.pizzaria.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.khayrus.pizzaria.modelo.entidades.Ingrediente;

@Repository
public interface IngredienteRepositorio extends CrudRepository<Ingrediente, Long>{
	
	

}
