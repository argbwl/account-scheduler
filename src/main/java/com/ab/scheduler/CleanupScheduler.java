package com.ab.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanupScheduler {

	@Scheduled(cron = "#{getSchedule}")
	public void runScheduler() {
		System.out.println("Scheduler started");
	}
	
	
	
}
