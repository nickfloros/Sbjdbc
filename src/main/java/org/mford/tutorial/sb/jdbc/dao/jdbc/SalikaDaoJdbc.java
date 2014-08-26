/**
 * 
 */
package org.mford.tutorial.sb.jdbc.dao.jdbc;

import org.mford.tutorial.sb.jdbc.dao.SakilaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author nick
 *
 */
@Repository("sakilaDao")
public class SalikaDaoJdbc implements SakilaDao {

	@Autowired
	@Qualifier("jdbcSakila")
	private JdbcTemplate jdbcSakila;

	/* (non-Javadoc)
	 * @see org.mford.tutorial.sb.jdbc.dao.SakilaDao#countActors()
	 */
	@Override
	public int countActors() {
		return jdbcSakila.queryForObject("select count(*) from sakila.actor", Long.class).intValue();
	}

}
