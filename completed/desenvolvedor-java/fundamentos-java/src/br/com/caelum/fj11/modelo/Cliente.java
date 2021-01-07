package br.com.caelum.fj11.modelo;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereço;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
