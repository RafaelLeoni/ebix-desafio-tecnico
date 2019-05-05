package br.com.ebix.oportunidade.dasafiotecnico.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.ebix.oportunidade.dasafiotecnico.repository.entity.User;

@WebService(name = "UserService")
public interface UserService {
	
	@WebMethod
	@WebResult(name = "return", targetNamespace = "")
	public int gravaUsuario(
			@WebParam(name = "nome", targetNamespace = "") String nome,
			@WebParam(name = "email", targetNamespace = "") String email
	);
	
	@WebMethod
	@WebResult(name = "return", targetNamespace = "")
	public int atualizaUsuario(
			@WebParam(name = "nome", targetNamespace = "") String nome,
			@WebParam(name = "email", targetNamespace = "") String email,
			@WebParam(name = "id", targetNamespace = "") long id
	);
	
	@WebMethod
	@WebResult(name = "return", targetNamespace = "")
	public int deletaUsuario(@WebParam(name = "id", targetNamespace = "")long id);
	
	@WebMethod
	@WebResult(name = "return", targetNamespace = "")
	public User recuperaUsuario(@WebParam(name = "id", targetNamespace = "")long id);
	
	@WebMethod
	@WebResult(name = "return", targetNamespace = "")
	public List<User> recuperaTodosUsuarios();

}
