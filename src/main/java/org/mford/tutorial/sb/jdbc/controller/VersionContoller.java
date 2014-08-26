/**
 * 
 */
package org.mford.tutorial.sb.jdbc.controller;

import org.mford.tutorial.sb.jdbc.dao.SakilaDao;
import org.mford.tutorial.sb.jdbc.dao.WorldDao;
import org.mford.tutorial.sb.jdbc.entiry.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nick
 *
 */
@RestController
public class VersionContoller {


	@Autowired
	@Qualifier("worldDao")
	private WorldDao worldDao;

	@Autowired
	@Qualifier("sakilaDao")
	private SakilaDao sakilaDao;
	
	@RequestMapping("/")
	public Version index() {
		return new Version("1.0","foo",worldDao.countCities(),sakilaDao.countActors());
	}
}
