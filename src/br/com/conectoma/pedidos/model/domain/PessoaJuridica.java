package br.com.conectoma.pedidos.model.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("JURIDICA")
@Table(name = "pessoaJuridica")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class PessoaJuridica extends Pessoa {

	@Column(name = "ie")
	private String IE;
	@Column(name = "cnpj")
	private String CNPJ;
	public String getIE() {
		return IE;
	}
	public void setIE(String iE) {
		IE = iE;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [IE=" + IE + ", CNPJ=" + CNPJ + "]";
	}

	
	
}