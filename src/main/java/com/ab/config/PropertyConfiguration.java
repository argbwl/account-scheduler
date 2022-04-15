package com.ab.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cron")
public class PropertyConfiguration {

	private String removeInactiveAccountCron;

	public String getRemoveInactiveAccountCron() {
		return removeInactiveAccountCron;
	}

	public void setRemoveInactiveAccountCron(String removeInactiveAccountCron) {
		this.removeInactiveAccountCron = removeInactiveAccountCron;
	}

}
