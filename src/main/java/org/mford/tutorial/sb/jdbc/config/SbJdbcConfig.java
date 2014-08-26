package org.mford.tutorial.sb.jdbc.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SbJdbcConfig {

}
