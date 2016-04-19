package br.com.conectoma.pedidos.utils;

@SuppressWarnings("serial")
public class ClienteNaoEncontradoException extends Exception {
	
	public ClienteNaoEncontradoException(Long id) {
		super(id.toString());
	}

}
