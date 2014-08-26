package org.mford.tutorial.sb.jdbc.dao.jdbc;

import org.mford.tutorial.sb.jdbc.dao.WorldDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("worldDao")
public class WorldDaoJdbc implements WorldDao {

	@Autowired
	@Qualifier("jdbcWorld")
	private JdbcTemplate jdbcWorld;

	
	@Override
	public int countCities() {
		return jdbcWorld.queryForObject("select count(*) from world.city", Long.class).intValue();
	}

}
