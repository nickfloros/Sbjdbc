/**
 * 
 */
package org.mford.tutorial.sb.jdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author nick
 *
 */
@Configuration
public class DbConfig {

	@Bean(name = "dsWorld")
	@Primary 
	@ConfigurationProperties(prefix = "spring.datasource.world")
	public DataSource worldDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "dsTest")
	@ConfigurationProperties(prefix = "spring.datasource.test")
	public DataSource world2DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "dsSakila")
	@ConfigurationProperties(prefix = "spring.datasource.sakila")
	public DataSource cityDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "jdbcSakila")
	@Autowired
	public JdbcTemplate sakilaJdbcTemplate(
			@Qualifier("dsSakila") DataSource ds) {
		return new JdbcTemplate(ds);
	}

	@Bean(name = "jdbcWorld")
	@Autowired
	public JdbcTemplate worldJdbcTemplate(
			@Qualifier("dsWorld") DataSource ds) {
		return new JdbcTemplate(ds);
	}

	@Bean(name = "jdbcTest")
	@Autowired
	public JdbcTemplate testJdbcTemplate(
			@Qualifier("dsTest") DataSource ds) {
		return new JdbcTemplate(ds);
	}

}
