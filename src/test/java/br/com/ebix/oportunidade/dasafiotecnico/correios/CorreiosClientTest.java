package br.com.ebix.oportunidade.dasafiotecnico.correios;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.ebix.oportunidade.dasafiotecnico.correios.client.CorreiosClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorreiosClientTest {
	
	@Autowired
	private CorreiosClient correiosClient;
	
	@Test
	public void testaConsultaCEP_esperaEnderecoCompleto() 
			throws SQLException_Exception, SigepClienteException {
		EnderecoERP endereco = correiosClient.consultaCEP("20090908");
		
		assertNotNull(endereco);
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Complemento2: " + endereco.getComplemento2());
		System.out.println("Endereco: " + endereco.getEnd());
		System.out.println("UF: " + endereco.getUf());
	}

}
