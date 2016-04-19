package br.com.conectoma.pedidos.model.facade;

import java.util.List;

import br.com.conectoma.pedidos.model.domain.Cliente;


public interface ClienteFacade {

	List<Cliente> getClientes();

	List<Cliente> getClientes(Long id);

	Cliente salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void deletarCliente(Long id);

}