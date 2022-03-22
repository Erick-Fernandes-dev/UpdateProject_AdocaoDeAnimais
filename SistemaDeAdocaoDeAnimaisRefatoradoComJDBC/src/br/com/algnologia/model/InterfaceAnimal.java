package br.com.algnologia.model;

import java.util.List;

import br.com.algnologia.exceptions.AnimalExisteException;

public interface InterfaceAnimal {
	
	public boolean existeUsuario(Usuario user);
	
	public void cadastraAnimal(Animal animal) throws AnimalExisteException;
	public List<Animal> pesquisaAnimaisDoTipo(String tipo);

}
