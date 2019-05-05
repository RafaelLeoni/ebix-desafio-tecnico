package br.com.ebix.oportunidade.dasafiotecnico.correios.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

@Component
public class CorreiosClient {
	
	@Autowired
	private AtendeCliente atendeClienteProxy;
	
	public EnderecoERP consultaCEP(String cep) throws SQLException_Exception, SigepClienteException {
		return atendeClienteProxy.consultaCEP(cep);
	}

}
