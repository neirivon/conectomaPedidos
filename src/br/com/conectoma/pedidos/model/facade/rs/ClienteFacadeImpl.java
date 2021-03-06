package br.com.conectoma.pedidos.model.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.conectoma.pedidos.model.dao.ClienteDao;
import br.com.conectoma.pedidos.model.domain.Cliente;
import br.com.conectoma.pedidos.model.facade.ClienteFacade;

@Path("/cliente")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ClienteFacadeImpl implements ClienteFacade {

	@Inject
	private ClienteDao clienteDao;
	
	/* (non-Javadoc)
	 * @see model.facade.rs.ClienteFacade#getClientes()
	 */
	@Override
	@GET
	public List<Cliente> getClientes() {
		return clienteDao.getClientes(new Cliente());
	}

	/* (non-Javadoc)
	 * @see model.facade.rs.ClienteFacade#getClientes(java.lang.Integer)
	 */
	@Override
	@GET
	@Path("/{id}")
	public List<Cliente> getClientes(@PathParam("id") Long id) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		return clienteDao.getClientes(cliente);
	}
	
	/* (non-Javadoc)
	 * @see model.facade.rs.ClienteFacade#salvar(model.domain.Cliente)
	 */
	@Override
	@POST 
	public Cliente salvar(Cliente cliente) { 
		cliente = clienteDao.salvar(cliente);
	 	return cliente;
	}
	
	/* (non-Javadoc)
	 * @see model.facade.rs.ClienteFacade#atualizar(model.domain.Cliente)
	 */
	@Override
	@PUT 
	public void atualizar(Cliente cliente) { 
		clienteDao.atualizar(cliente);
	}

	/* (non-Javadoc)
	 * @see model.facade.rs.ClienteFacade#deletarCliente(java.lang.Integer)
	 */
	@Override
	@DELETE
	@Path("/{id}")
	public void deletarCliente(@PathParam("id") Long id) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		clienteDao.excluir(cliente);
	}

}
