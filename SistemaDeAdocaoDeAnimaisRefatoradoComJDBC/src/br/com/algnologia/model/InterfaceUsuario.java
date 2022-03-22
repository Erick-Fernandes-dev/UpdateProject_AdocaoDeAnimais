package br.com.algnologia.model;

import java.util.List;

import br.com.algnologia.exceptions.AnimalExisteException;
import br.com.algnologia.exceptions.UsuarioJaExistenteException;

public interface InterfaceUsuario {
	
	public List<Usuario> pesquisaUsuario(Integer id);
	
	public List<Usuario> pesquisaUsuarioComOPrefixo(String prefixo);
	
	public void cadastraUsuario(Usuario user) throws UsuarioJaExistenteException;
	
	public void removeUsuario(Integer id);
	
	public void alteraUsuario(String nome, String cpf, String data, Integer id);
	


}
