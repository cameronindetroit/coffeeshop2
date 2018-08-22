package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Items> findAll() {

		String sql = "SELECT * FROM items ";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));

	}

	public Items findById(Integer name) {

		String sql = "SELECT * FROM Room WHERE name = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Items.class), name);

	}

}
