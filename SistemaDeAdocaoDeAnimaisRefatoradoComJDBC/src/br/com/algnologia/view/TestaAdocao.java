package br.com.algnologia.view;

import java.util.Scanner;

import br.com.algnologia.dao.UsuarioDAO;
import br.com.algnologia.exceptions.UsuarioJaExistenteException;
import br.com.algnologia.factory.ConnectionFactory;
import br.com.algnologia.model.Usuario;
import br.com.algnologia.model.UsuarioNaoExisteException;

public class TestaAdocao {
	
	public static void main(String[] args) throws UsuarioJaExistenteException {
		
		
		ConnectionFactory connection = new ConnectionFactory();
		UsuarioDAO userD = new UsuarioDAO(connection.recuperaConexao());
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("=======Cadastrando Usuario========");
//		
//		System.out.print("Digite seu nome: ");
//		String nome = sc.nextLine();
//		
//		System.out.print("Digite seu cpf: ");
//		String cpf = sc.nextLine();
//		
//		
//		
//		System.out.print("Digite alguma data: ");
//		String data = sc.nextLine();
//		
		System.out.print("Digite o id que vai ser alterado: ");
		Integer id = Integer.parseInt(sc.nextLine());

		//CADASTRA USUARIO
		
//		userD.cadastraUsuario(new Usuario(nome, cpf, data));
		
		// PESQUISA USUARIO
//		System.out.println(userD.pesquisaUsuario(1));
		
		//ALTERA USUARIO
//		userD.alteraUsuario(nome, cpf, data, id);
		
		userD.removeUsuario(id);
		
		System.out.println("cadastrou.......");
	}

}
