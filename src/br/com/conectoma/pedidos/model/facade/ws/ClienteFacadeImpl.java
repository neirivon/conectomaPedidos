package br.com.conectoma.pedidos.model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.conectoma.pedidos.model.dao.ClienteDao;
import br.com.conectoma.pedidos.model.domain.Cliente;
import br.com.conectoma.pedidos.model.facade.ClienteFacade;



@WebService(serviceName="ws/cliente")
public class ClienteFacadeImpl implements ClienteFacade {
	
	@Inject
	private ClienteDao clienteDao;
			
	@WebMethod
	public List<Cliente> getClientes() {
		return clienteDao.getClientes(new Cliente());
	}
	
	@Override
	@WebMethod(operationName="getClienteId")
	public List<Cliente> getClientes(@WebParam(name="idCliente") 
							Long id) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		return clienteDao.getClientes(cliente);
	}
	
	@WebMethod
	public Cliente salvar(@WebParam(name="cliente") Cliente cliente) {
		return clienteDao.salvar(cliente);
	}
	
	@WebMethod
	public void atualizar(@WebParam(name="cliente") Cliente cliente) {
		clienteDao.atualizar(cliente);
	}
	
	@WebMethod
	public void deletarCliente(@WebParam(name="idCliente") Long id) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		clienteDao.excluir(cliente);
	}


}
