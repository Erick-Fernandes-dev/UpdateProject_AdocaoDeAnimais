package br.com.algnologia.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {

		ComboPooledDataSource combo = new ComboPooledDataSource();
		combo.setJdbcUrl("jdbc:mysql://localhost/adocao_virtual?useTimezone=true&serverTimezone=UTC");
		combo.setUser("root");
		combo.setPassword("tbwa0002");

		this.dataSource = combo;

	}

	public Connection recuperaConexao() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
