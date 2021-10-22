package br.com.alura.imposto;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmiss�o;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	private String Observacoes;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmiss�o, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmiss�o = dataDeEmiss�o;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		Observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataDeEmiss�o() {
		return dataDeEmiss�o;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return Observacoes;
	}

}
