package br.com.algnologia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.algnologia.exceptions.UsuarioJaExistenteException;
import br.com.algnologia.model.InterfaceUsuario;
import br.com.algnologia.model.Usuario;

public class UsuarioDAO implements InterfaceUsuario {

	private Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;

	}

	@Override
	public List<Usuario> pesquisaUsuario(Integer id) {

		try {

			List<Usuario> usuarioAchado = new ArrayList<Usuario>();

			String sql = "SELECT id, nome, cpf, data FROM USUARIO WHERE id = ?";

			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {

				pstm.setInt(1, id);

				pstm.execute();

				transformaResultSet(usuarioAchado, pstm);

			}
			return usuarioAchado;

		} catch (SQLException e) {

			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Usuario> pesquisaUsuarioComOPrefixo(String prefixo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastraUsuario(Usuario user) throws UsuarioJaExistenteException {

		try {

			if (!user.getCpf().isEmpty()) {

				String sql = "INSERT INTO USUARIO (nome, cpf, data) VALUES (?, ?, ?)";

				try (PreparedStatement pstm = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

					pstm.setString(1, user.getNome());
					pstm.setString(2, user.getCpf());
					pstm.setString(3, user.getDataNascimento());

					pstm.execute();

					try (ResultSet rst = pstm.getGeneratedKeys()) {
						while (rst.next()) {
							user.setId(rst.getInt(1));
						}
					}
				}

			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void removeUsuario(Integer id) {

		try {

			String sql = "DELETE FROM USUARIO WHERE id = ?";

			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {

				pstm.setInt(1, id);
				pstm.execute();

			}

		} catch (SQLException e) {

			throw new RuntimeException(e);

		}

	}

	public void transformaResultSet(List<Usuario> users, PreparedStatement pstm) {

		try (ResultSet rst = pstm.getResultSet()) {

			while (rst.next()) {

				Usuario user = new Usuario(rst.getString(2), rst.getString(3), rst.getString(4));

				// if (user.getCpf().equalsIgnoreCase(cpf)) {
				users.add(user);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void alteraUsuario(String nome, String cpf, String data, Integer id) {

		String sql = "UPDATE USUARIO U SET U.nome = ?, U.cpf = ?, U.data = ? WHERE id = ?";

		try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {

			pstm.setString(1, nome);
			pstm.setString(2, cpf);
			pstm.setString(3, data);
			pstm.setInt(4, id);

			pstm.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
