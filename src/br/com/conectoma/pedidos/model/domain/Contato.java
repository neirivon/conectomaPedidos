package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa", nullable = false)
	private Pessoa contato;
	
	@OneToMany(mappedBy="contato")
	private List<Email> emails;
	
	@OneToMany(mappedBy="contato")
	private List<Telefone> telefones;
	
	@OneToMany(mappedBy="contato")
	private List<NomeContato> nomesContato;
	
	@OneToMany(mappedBy="contato")
	private List<Endereco> enderecos;
	
	public Contato() {
		this.emails = new ArrayList<>();
		this.telefones = new ArrayList<>();
		this.nomesContato = new ArrayList<>();
		this.enderecos = new ArrayList<>();
	}
	
	public Contato(Long id, Pessoa contato) {
		this.id = id;
		this.contato = contato;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public Pessoa getContato() {
		return contato;
	}

	public void setContato(Pessoa contato) {
		this.contato = contato;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<NomeContato> getNomesContato() {
		return nomesContato;
	}

	public void setNomesContato(List<NomeContato> nomesContato) {
		this.nomesContato = nomesContato;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Pessoa getPessoa() {
		return null;
	}

	public void setPessoa(Pessoa pessoa) {

	}

	public void adicionarEmail(Email email) {

	}

	public void adicionarEndereco(Endereco endereco) {

	}

	public void adicionarTelefone(Telefone telefone) {

	}

}