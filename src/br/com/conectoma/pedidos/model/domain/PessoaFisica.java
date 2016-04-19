package br.com.conectoma.pedidos.model.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("FISICA")
@Table(name = "pessoaFisica")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class PessoaFisica extends Pessoa {

	@Column(name = "rg")
	private String RG;
	@Column(name = "cpf")
	private String CPF;

	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	
}