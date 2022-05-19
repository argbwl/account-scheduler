package com.ab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {

	
	@Bean
	public String getSchedule() {
		return "0 0/2 * * * ?";
	}
	
	
}
