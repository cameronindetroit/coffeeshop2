package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class userDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void create(User user) {
		System.out.println("Create: " + user);

		String sql = "INSERT INTO users (firstname, lastname, email, phonenumber, password, age) VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getNumber(),
				user.getPassword(), user.getAge());

	}

}
