package br.com.ebix.oportunidade.dasafiotecnico.webservice.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ebix.oportunidade.dasafiotecnico.webservice.UserService;

@Configuration
public class EndpointConfig {
	
	@Autowired
	private Bus bus;
	
	@Autowired
	private UserService userService;
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, userService);
		endpoint.publish("/userService");
		return endpoint;
	}

}
