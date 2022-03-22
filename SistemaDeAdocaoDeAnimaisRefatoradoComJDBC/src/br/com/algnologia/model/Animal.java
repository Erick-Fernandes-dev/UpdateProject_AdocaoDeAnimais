package br.com.algnologia.model;

import java.util.Objects;

public abstract class Animal {
	
	private String nome;
	private String codigo;
	private String dataDeNascrimento;
	private String tamanho;
	private boolean ehhBarulhento = false;
	private boolean ehManso = false;
	private String cor;
	private String sexo;
	private boolean temPedigrr = false;
	private boolean estahComVacinaEmDia = false;
	private boolean estahCadastrado = false;
	private String detalhes;
	private String tipoAlientacao;
	

	public Animal(String nome, String codigo, String dataDeNascrimento, String tamanho, boolean ehhBarulhento,
			boolean ehManso, String cor, String sexo, boolean temPedigrr, boolean estahComVacinaEmDia,
			boolean estahCadastrado, String detalhes, String tipoAlientacao) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.dataDeNascrimento = dataDeNascrimento;
		this.tamanho = tamanho;
		this.ehhBarulhento = ehhBarulhento;
		this.ehManso = ehManso;
		this.cor = cor;
		this.sexo = sexo;
		this.temPedigrr = temPedigrr;
		this.estahComVacinaEmDia = estahComVacinaEmDia;
		this.estahCadastrado = estahCadastrado;
		this.detalhes = detalhes;
		this.tipoAlientacao = tipoAlientacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDataDeNascrimento() {
		return dataDeNascrimento;
	}

	public void setDataDeNascrimento(String dataDeNascrimento) {
		this.dataDeNascrimento = dataDeNascrimento;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isEhhBarulhento() {
		return ehhBarulhento;
	}

	public void setEhhBarulhento(boolean ehhBarulhento) {
		this.ehhBarulhento = ehhBarulhento;
	}

	public boolean isEhManso() {
		return ehManso;
	}

	public void setEhManso(boolean ehManso) {
		this.ehManso = ehManso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isTemPedigrr() {
		return temPedigrr;
	}

	public void setTemPedigrr(boolean temPedigrr) {
		this.temPedigrr = temPedigrr;
	}

	public boolean isEstahComVacinaEmDia() {
		return estahComVacinaEmDia;
	}

	public void setEstahComVacinaEmDia(boolean estahComVacinaEmDia) {
		this.estahComVacinaEmDia = estahComVacinaEmDia;
	}

	public boolean isEstahCadastrado() {
		return estahCadastrado;
	}

	public void setEstahCadastrado(boolean estahCadastrado) {
		this.estahCadastrado = estahCadastrado;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getTipoAlientacao() {
		return tipoAlientacao;
	}

	public void setTipoAlientacao(String tipoAlientacao) {
		this.tipoAlientacao = tipoAlientacao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, cor, dataDeNascrimento, detalhes, ehManso, ehhBarulhento, estahCadastrado,
				estahComVacinaEmDia, nome, sexo, tamanho, temPedigrr, tipoAlientacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(cor, other.cor)
				&& Objects.equals(dataDeNascrimento, other.dataDeNascrimento)
				&& Objects.equals(detalhes, other.detalhes) && ehManso == other.ehManso
				&& ehhBarulhento == other.ehhBarulhento && estahCadastrado == other.estahCadastrado
				&& estahComVacinaEmDia == other.estahComVacinaEmDia && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(tamanho, other.tamanho)
				&& Objects.equals(tipoAlientacao, other.tipoAlientacao);
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", codigo=" + codigo + ", dataDeNascrimento=" + dataDeNascrimento + ", tamanho="
				+ tamanho + ", ehhBarulhento=" + ehhBarulhento + ", ehManso=" + ehManso + ", cor=" + cor + ", sexo="
				+ sexo + ", temPedigrr=" + temPedigrr + ", estahComVacinaEmDia=" + estahComVacinaEmDia
				+ ", estahCadastrado=" + estahCadastrado + ", detalhes=" + detalhes + ", tipoAlientacao="
				+ tipoAlientacao + "]";
	}
	
	public abstract String tipo();
	

}
