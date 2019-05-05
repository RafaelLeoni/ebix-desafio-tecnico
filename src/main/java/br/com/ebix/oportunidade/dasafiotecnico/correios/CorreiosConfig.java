package br.com.ebix.oportunidade.dasafiotecnico.correios;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.ebix.oportunidade.dasafiotecnico.correios.rest.CorreiosRest;

@Configuration
public class CorreiosConfig {
	
	@Value("${correios.servico.address}")
	private String address;

	@Bean
	public AtendeCliente atendeClienteProxy() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(AtendeCliente.class);
		jaxWsProxyFactoryBean.setAddress(address);

		return (AtendeCliente) jaxWsProxyFactoryBean.create();
	}
	
	@Bean
	public ResourceConfig resourceConfig() {
		return new ResourceConfig().register(CorreiosRest.class);
	}

}
