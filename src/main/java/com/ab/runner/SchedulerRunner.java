package com.ab.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ab.config.QueuePropertiesConfiguration;

@Component
public class SchedulerRunner implements CommandLineRunner{
	
	@Autowired
	private QueuePropertiesConfiguration queueConfig;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("SchedulerRunner.run()");
		System.out.println(queueConfig.getRequestQueue());
	}

}
