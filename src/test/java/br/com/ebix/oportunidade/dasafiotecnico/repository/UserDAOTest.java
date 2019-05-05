package br.com.ebix.oportunidade.dasafiotecnico.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.ebix.oportunidade.dasafiotecnico.repository.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {
	
	@Autowired
	private UserDAO userDao;
	
	@Test
	public void testaSelecaoTodosUsuarios_esperaListaDeTodosUsuarios() {
		List<User> users = userDao.findAll();
		assertTrue(!userDao.findAll().isEmpty());
		users.forEach(System.out::println);
	}
	
	@Test
	public void testaSelecaoUsuarioPorId_esperaUsuarioComIdPassado() {
		User user = userDao.findById(1);
		assertNotNull(user);
		System.out.println(user);
	}
	
	@Test
	public void testaInsercaoUsuario_esperaRetornoPositivo() {
		User user = new User("Test User", "test_user@mail.com");
		assertTrue(userDao.insert(user) > 0);
		System.out.println("Usuário inserido");
	}
	
	@Test
	public void testaAtualizacaoUsuario_esperaRetornoPositivo() {
		User user = new User("Test User Update", "test_user_update@mail.com");
		user.setId(4L);
		assertTrue(userDao.update(user) > 0);
		System.out.println("Usuário atualizado");
	}
	
	@Test
	public void testaDelecaoUsuario_esperaRetornoPositivo() {
		assertTrue(userDao.delete(3) > 0);
		System.out.println("Usuário deletado");
	}

}
