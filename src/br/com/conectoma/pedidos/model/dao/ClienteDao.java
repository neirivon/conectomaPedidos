package br.com.conectoma.pedidos.model.dao;

import java.util.List;

import br.com.conectoma.pedidos.model.domain.Cliente;


//Neirivon Elias Cardoso
public interface ClienteDao {

	List<Cliente> getClientes(Cliente cliente);
	
	public void excluir(Cliente cliente);

	Cliente salvar(Cliente cliente);

	void atualizar(Cliente cliente);

}
