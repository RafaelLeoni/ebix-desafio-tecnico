package br.com.ebix.oportunidade.dasafiotecnico.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.ebix.oportunidade.dasafiotecnico.repository.entity.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int row) throws SQLException {
		User user = new User();
		user.setId(rs.getLong("ID"));
		user.setName(rs.getString("NAME"));
		user.setEmail(rs.getString("EMAIL"));
		user.setCreateDate(rs.getDate("CREATE_DATE"));
		return user;
	}

}
