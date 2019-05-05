package br.com.ebix.oportunidade.dasafiotecnico.correios.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.ebix.oportunidade.dasafiotecnico.correios.client.CorreiosClient;

@Component
@Path("/rest")
public class CorreiosRest {
	
	@Autowired
	private CorreiosClient correiosClient;
	
	@GET
	@Path("/cep/{cep}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultaCEP(@PathParam("cep") String cep) {
		try {
			return Response.ok(correiosClient.consultaCEP(cep)).build();
		} catch (SQLException_Exception | SigepClienteException e) {
			return Response.status(Status.BAD_REQUEST)
				.entity("message: " + e.getMessage()).build();
		}
	}

}
