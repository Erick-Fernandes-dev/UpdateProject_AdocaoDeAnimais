package br.com.algnologia.model;

import java.util.List;
import java.util.Objects;

public class Usuario {

	private Integer id;
	private String nome;
	private String cpf;
	private String dataNascimento;

	public Usuario(String nome, String cpf, String dataNascimento) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}

}
