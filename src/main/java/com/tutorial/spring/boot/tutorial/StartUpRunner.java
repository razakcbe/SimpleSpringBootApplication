package com.tutorial.spring.boot.tutorial;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StartUpRunner implements CommandLineRunner {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DataSource ds;
	

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("StartUpRunner" + ds.toString());
	}
}
