package br.com.algnologia.model;

public class Gato extends Animal {
	
	public final String TIPO_ANIMAL_GATO = "Gato";

	public Gato(String nome, String codigo, String dataDeNascrimento, String tamanho, boolean ehhBarulhento,
			boolean ehManso, String cor, String sexo, boolean temPedigrr, boolean estahComVacinaEmDia,
			boolean estahCadastrado, String detalhes, String tipoAlientacao) {
		super(nome, codigo, dataDeNascrimento, tamanho, ehhBarulhento, ehManso, cor, sexo, temPedigrr, estahComVacinaEmDia,
				estahCadastrado, detalhes, tipoAlientacao);
		
		tipo();
	}

	@Override
	public String tipo() {
		return TIPO_ANIMAL_GATO;
	}

}
