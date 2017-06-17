package com.tutorial.spring.boot.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean
	public StartUpRunner getStartUpRunnerInstance(){
		return new StartUpRunner();
	}
	
	@Bean
	public Scheduler getSchedulerInstance(){
		return new Scheduler();
	}
}
