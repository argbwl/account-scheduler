package com.ab.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ab.config.PropertyConfiguration;

@Component
public class AccountScheduler {

	@Autowired
	private PropertyConfiguration config;
	
	@Scheduled(cron = "${cronExpression}")
	public void cronJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Java cron job expression:: " + strDate);
		System.out.println(config.getRemoveInactiveAccountCron());
	}

}
