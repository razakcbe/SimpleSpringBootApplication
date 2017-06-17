package com.tutorial.spring.boot.tutorial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class Scheduler {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Scheduled(initialDelay=20000,fixedDelay=10000)
	public void run(){
		logger.info("Running................");
	}
}
