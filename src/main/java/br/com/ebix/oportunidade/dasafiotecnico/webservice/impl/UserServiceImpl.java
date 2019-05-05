package br.com.ebix.oportunidade.dasafiotecnico.webservice.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ebix.oportunidade.dasafiotecnico.repository.UserDAO;
import br.com.ebix.oportunidade.dasafiotecnico.repository.entity.User;
import br.com.ebix.oportunidade.dasafiotecnico.webservice.UserService;

@Component
@WebService
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public int gravaUsuario(String nome, String email) {
		User user = new User(nome, email);
		return userDao.insert(user);
	}

	@Override
	public int atualizaUsuario(String nome, String email, long id) {
		User user = new User(id, nome, email);
		return userDao.update(user);
	}

	@Override
	public int deletaUsuario(long id) {
		return userDao.delete(id);
	}

	@Override
	public User recuperaUsuario(long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> recuperaTodosUsuarios() {
		return userDao.findAll();
	}

}
