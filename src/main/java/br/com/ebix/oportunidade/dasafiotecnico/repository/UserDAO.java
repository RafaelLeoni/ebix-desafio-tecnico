package br.com.ebix.oportunidade.dasafiotecnico.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.ebix.oportunidade.dasafiotecnico.repository.entity.User;
import br.com.ebix.oportunidade.dasafiotecnico.repository.mapper.UserMapper;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${user.query.insert}")
	private String queryInsert;
	@Value("${user.query.update}")
	private String queryUpdate;
	@Value("${user.query.delete}")
	private String queryDelete;
	@Value("${user.query.select}")
	private String querySelect;
	@Value("${user.query.find.all}")
	private String queryFindAll;
	
	public int insert(User user) {
	    return jdbcTemplate.update(queryInsert, new Object[] {
        	user.getName(), 
        	user.getEmail(),
        	new Date()
        });
	}

	public int update(User user) {
		return jdbcTemplate.update(queryUpdate,	new Object[] {
			user.getName(), 
        	user.getEmail(),
        	user.getId()
		});
	}
	
	public int delete(long id) {
		return jdbcTemplate.update(queryDelete, new Object[] {id});
	}
	

	public User findById(long id) {
		return jdbcTemplate.queryForObject(querySelect, new Object[] {id}, new UserMapper());
	}
	
	public List<User> findAll() {
		return jdbcTemplate.query(queryFindAll, new UserMapper());
	}
	
}
