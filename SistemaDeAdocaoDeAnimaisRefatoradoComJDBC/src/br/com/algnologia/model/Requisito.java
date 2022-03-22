package br.com.algnologia.model;

public class Requisito {
	
	private String nomeRequisito;
	private String valorEsperandoRequisito;
	
	
	public Requisito(String nomeRequisito, String valorEsperandoRequisito) {
		this.nomeRequisito = nomeRequisito;
		this.valorEsperandoRequisito = valorEsperandoRequisito;
	}


	public String getNomeRequisito() {
		return nomeRequisito;
	}


	public void setNomeRequisito(String nomeRequisito) {
		this.nomeRequisito = nomeRequisito;
	}


	public String getValorEsperandoRequisito() {
		return valorEsperandoRequisito;
	}


	public void setValorEsperandoRequisito(String valorEsperandoRequisito) {
		this.valorEsperandoRequisito = valorEsperandoRequisito;
	}


	@Override
	public String toString() {
		return "Requisito [nomeRequisito=" + nomeRequisito + ", valorEsperandoRequisito=" + valorEsperandoRequisito
				+ "]";
	}
	
	
	
	
	
	

}
